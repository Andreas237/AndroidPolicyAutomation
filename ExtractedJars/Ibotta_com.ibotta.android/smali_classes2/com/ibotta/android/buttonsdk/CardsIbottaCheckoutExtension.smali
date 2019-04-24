.class public Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;
.super Ljava/lang/Object;
.source "CardsIbottaCheckoutExtension.java"

# interfaces
.implements Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;
    }
.end annotation


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final cardDelayMilliseconds:I

.field private final cardFactory:Lcom/ibotta/android/buttonsdk/card/CardFactory;

.field private final checkoutExtensionViewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

.field private final context:Landroid/content/Context;

.field private final handler:Landroid/os/Handler;

.field private productUrl:Ljava/lang/String;

.field private viewMode:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;ILandroid/os/Handler;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p2, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->checkoutExtensionViewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    .line 58
    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->context:Landroid/content/Context;

    .line 59
    iput p3, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->cardDelayMilliseconds:I

    .line 60
    iput-object p4, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->handler:Landroid/os/Handler;

    .line 61
    sget-object p2, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;->INITIAL:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

    iput-object p2, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->viewMode:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

    .line 62
    iput-object p5, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 64
    new-instance p2, Lcom/ibotta/android/buttonsdk/card/CardFactory;

    invoke-direct {p2, p1}, Lcom/ibotta/android/buttonsdk/card/CardFactory;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->cardFactory:Lcom/ibotta/android/buttonsdk/card/CardFactory;

    return-void
.end method

.method private addCard(Lcom/ibotta/android/buttonsdk/card/CardType;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 7
    .param p3    # Lcom/usebutton/sdk/purchasepath/BrowserInterface;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 153
    sget-object v0, Lcom/ibotta/android/buttonsdk/card/CardType;->SPECIAL_CONDITIONS:Lcom/ibotta/android/buttonsdk/card/CardType;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->checkoutExtensionViewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    .line 154
    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->getSpecialConditions()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 159
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->cardFactory:Lcom/ibotta/android/buttonsdk/card/CardFactory;

    iget-object v4, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->checkoutExtensionViewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    iget-object v5, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->viewMode:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

    iget-object v6, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->appHelper:Lcom/ibotta/android/util/AppHelper;

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v1 .. v6}, Lcom/ibotta/android/buttonsdk/card/CardFactory;->createCard(Lcom/ibotta/android/buttonsdk/card/CardType;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;Lcom/ibotta/android/util/AppHelper;)Lcom/usebutton/sdk/purchasepath/Card;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 161
    invoke-interface {p3}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 162
    invoke-interface {p3}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/usebutton/sdk/purchasepath/CardList;->addCard(Lcom/usebutton/sdk/purchasepath/Card;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 165
    sget-object p2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private addCards(Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 2
    .param p2    # Lcom/usebutton/sdk/purchasepath/BrowserInterface;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->viewMode:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

    sget-object v1, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;->PRODUCT:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

    if-ne v0, v1, :cond_0

    .line 134
    sget-object v0, Lcom/ibotta/android/buttonsdk/card/CardType;->PRODUCT:Lcom/ibotta/android/buttonsdk/card/CardType;

    invoke-direct {p0, v0, p1, p2}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->addCard(Lcom/ibotta/android/buttonsdk/card/CardType;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    goto :goto_0

    .line 136
    :cond_0
    sget-object v0, Lcom/ibotta/android/buttonsdk/card/CardType;->RETAILER:Lcom/ibotta/android/buttonsdk/card/CardType;

    invoke-direct {p0, v0, p1, p2}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->addCard(Lcom/ibotta/android/buttonsdk/card/CardType;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 140
    :goto_0
    sget-object v0, Lcom/ibotta/android/buttonsdk/card/CardType;->HOW_IBOTTA_WORKS:Lcom/ibotta/android/buttonsdk/card/CardType;

    invoke-direct {p0, v0, p1, p2}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->addCard(Lcom/ibotta/android/buttonsdk/card/CardType;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 141
    sget-object v0, Lcom/ibotta/android/buttonsdk/card/CardType;->SPECIAL_CONDITIONS:Lcom/ibotta/android/buttonsdk/card/CardType;

    invoke-direct {p0, v0, p1, p2}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->addCard(Lcom/ibotta/android/buttonsdk/card/CardType;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    return-void
.end method

.method private removeCards(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/purchasepath/BrowserInterface;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 126
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 127
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object p1

    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/CardList;->removeAllCards()V

    :cond_0
    return-void
.end method

.method private showActiveCard(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 4
    .param p1    # Lcom/usebutton/sdk/purchasepath/BrowserInterface;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 145
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->showTopCard()V

    .line 147
    iget v0, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->cardDelayMilliseconds:I

    if-lez v0, :cond_0

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->handler:Landroid/os/Handler;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/buttonsdk/-$$Lambda$p0bEpbPKdTIYcusWrRRXaXHAvGA;

    invoke-direct {v1, p1}, Lcom/ibotta/android/buttonsdk/-$$Lambda$p0bEpbPKdTIYcusWrRRXaXHAvGA;-><init>(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    iget p1, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->cardDelayMilliseconds:I

    int-to-long v2, p1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public onClosed()V
    .locals 0

    return-void
.end method

.method public onInitialized(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 4
    .param p1    # Lcom/usebutton/sdk/purchasepath/BrowserInterface;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->checkoutExtensionViewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->getRetailerName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 70
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getHeader()Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;

    move-result-object v0

    invoke-interface {v0}, Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;->getTitle()Lcom/usebutton/sdk/internal/BrowserText;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->checkoutExtensionViewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    invoke-virtual {v1}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->getRetailerName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/BrowserText;->setText(Ljava/lang/String;)V

    .line 73
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->checkoutExtensionViewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 74
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getHeader()Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;

    move-result-object v0

    invoke-interface {v0}, Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;->getSubtitle()Lcom/usebutton/sdk/internal/BrowserText;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->checkoutExtensionViewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    invoke-virtual {v1}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->getSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/BrowserText;->setText(Ljava/lang/String;)V

    .line 77
    :cond_1
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getHeader()Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;

    move-result-object v0

    invoke-interface {v0}, Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;->getTitle()Lcom/usebutton/sdk/internal/BrowserText;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->context:Landroid/content/Context;

    const v2, 0x7f0600f0

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/BrowserText;->setColor(I)V

    .line 78
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getHeader()Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;

    move-result-object v0

    invoke-interface {v0}, Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;->getSubtitle()Lcom/usebutton/sdk/internal/BrowserText;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->context:Landroid/content/Context;

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/BrowserText;->setColor(I)V

    .line 79
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getHeader()Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->context:Landroid/content/Context;

    const v3, 0x7f060171

    invoke-static {v1, v3}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;->setBackgroundColor(I)V

    .line 80
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getHeader()Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->context:Landroid/content/Context;

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;->setTintColor(I)V

    .line 81
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getFooter()Lcom/usebutton/sdk/purchasepath/BrowserInterface$Footer;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->context:Landroid/content/Context;

    invoke-static {v1, v3}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface$Footer;->setBackgroundColor(I)V

    .line 82
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getFooter()Lcom/usebutton/sdk/purchasepath/BrowserInterface$Footer;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->context:Landroid/content/Context;

    invoke-static {v0, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-interface {p1, v0}, Lcom/usebutton/sdk/purchasepath/BrowserInterface$Footer;->setTintColor(I)V

    return-void
.end method

.method public onPageNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/BrowserPage;)V
    .locals 2
    .param p1    # Lcom/usebutton/sdk/purchasepath/BrowserInterface;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/purchasepath/BrowserPage;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->viewMode:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

    sget-object v1, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;->RETAILER:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

    if-eq v0, v1, :cond_0

    invoke-interface {p2}, Lcom/usebutton/sdk/purchasepath/BrowserPage;->getUrl()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->productUrl:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 97
    sget-object p2, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;->RETAILER:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

    iput-object p2, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->viewMode:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

    .line 99
    invoke-direct {p0, p1}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->removeCards(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 100
    sget-object p2, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->COMMISSIONABLE:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    invoke-direct {p0, p2, p1}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->addCards(Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 101
    invoke-direct {p0, p1}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->showActiveCard(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    :cond_0
    return-void
.end method

.method public onProductNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/ProductPage;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/purchasepath/BrowserInterface;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/purchasepath/ProductPage;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 107
    invoke-interface {p2}, Lcom/usebutton/sdk/purchasepath/ProductPage;->getUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->productUrl:Ljava/lang/String;

    .line 108
    sget-object v0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;->PRODUCT:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

    iput-object v0, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->viewMode:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

    .line 110
    invoke-direct {p0, p1}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->removeCards(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 111
    invoke-interface {p2}, Lcom/usebutton/sdk/purchasepath/ProductPage;->getCommission()Lcom/usebutton/sdk/purchasepath/Commission;

    move-result-object p2

    invoke-virtual {p2}, Lcom/usebutton/sdk/purchasepath/Commission;->getCommissionType()Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    move-result-object p2

    invoke-direct {p0, p2, p1}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->addCards(Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 112
    invoke-direct {p0, p1}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->showActiveCard(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    return-void
.end method

.method public onPurchaseNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/PurchasePage;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/purchasepath/BrowserInterface;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/purchasepath/PurchasePage;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    return-void
.end method

.method public onStartNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/purchasepath/BrowserInterface;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 87
    invoke-direct {p0, p1}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->removeCards(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 88
    sget-object v0, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->COMMISSIONABLE:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->addCards(Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 89
    invoke-direct {p0, p1}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;->showActiveCard(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    return-void
.end method
