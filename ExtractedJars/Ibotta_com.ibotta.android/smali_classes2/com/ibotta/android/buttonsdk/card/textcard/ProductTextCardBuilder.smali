.class public Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;
.super Ljava/lang/Object;
.source "ProductTextCardBuilder.java"

# interfaces
.implements Lcom/ibotta/android/buttonsdk/card/textcard/TextCardBuilder;


# instance fields
.field private final commissionType:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

.field private final context:Landroid/content/Context;

.field private final viewMode:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

.field private final viewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->context:Landroid/content/Context;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->commissionType:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->viewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    .line 31
    iput-object p4, p0, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->viewMode:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

    return-void
.end method


# virtual methods
.method public buildCard()Lcom/usebutton/sdk/purchasepath/Card;
    .locals 5

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->commissionType:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    iget-object v2, p0, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->viewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    iget-object v3, p0, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->viewMode:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/buttonsdk/card/CardBuilder$-CC;->buildCallToAction(Landroid/content/Context;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;)Lcom/usebutton/sdk/purchasepath/CallToAction;

    move-result-object v0

    .line 37
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->buildTitle()Ljava/lang/String;

    move-result-object v1

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->buildDescription()Ljava/lang/String;

    move-result-object v2

    .line 39
    iget-object v3, p0, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->commissionType:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    invoke-static {v3}, Lcom/ibotta/android/buttonsdk/card/CardBuilder$-CC;->getTextCardBackgroundColor(Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;)I

    move-result v3

    .line 41
    new-instance v4, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;

    invoke-direct {v4, v0, v1, v2}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;-><init>(Lcom/usebutton/sdk/purchasepath/CallToAction;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->context:Landroid/content/Context;

    .line 42
    invoke-static {v0, v3}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->setBackgroundColor(I)Lcom/usebutton/sdk/purchasepath/TextCard$Builder;

    move-result-object v0

    sget-object v1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 43
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->setBodyTypeface(Landroid/graphics/Typeface;)Lcom/usebutton/sdk/purchasepath/TextCard$Builder;

    move-result-object v0

    sget-object v1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 44
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->setTitleTypeface(Landroid/graphics/Typeface;)Lcom/usebutton/sdk/purchasepath/TextCard$Builder;

    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->build()Lcom/usebutton/sdk/purchasepath/TextCard;

    move-result-object v0

    return-object v0
.end method

.method public buildDescription()Ljava/lang/String;
    .locals 5

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->commissionType:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    sget-object v1, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->COMMISSIONABLE:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    if-ne v0, v1, :cond_0

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->context:Landroid/content/Context;

    const v1, 0x7f11012b

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->viewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    invoke-virtual {v4}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->getCashBackString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 59
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->context:Landroid/content/Context;

    const v1, 0x7f110444

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public buildTitle()Ljava/lang/String;
    .locals 5

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->commissionType:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    sget-object v1, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->COMMISSIONABLE:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    if-ne v0, v1, :cond_0

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->context:Landroid/content/Context;

    const v1, 0x7f11012c

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->viewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    invoke-virtual {v4}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->getCashBackString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 52
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->context:Landroid/content/Context;

    const v1, 0x7f110445

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
