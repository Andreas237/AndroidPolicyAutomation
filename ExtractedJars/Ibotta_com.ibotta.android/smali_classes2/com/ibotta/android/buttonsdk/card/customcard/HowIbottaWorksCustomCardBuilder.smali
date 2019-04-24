.class public Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;
.super Ljava/lang/Object;
.source "HowIbottaWorksCustomCardBuilder.java"

# interfaces
.implements Lcom/ibotta/android/buttonsdk/card/customcard/CustomCardBuilder;


# instance fields
.field private final commissionType:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

.field private final context:Landroid/content/Context;

.field private final viewMode:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

.field private final viewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;->context:Landroid/content/Context;

    .line 26
    iput-object p2, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;->commissionType:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    .line 27
    iput-object p3, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;->viewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    .line 28
    iput-object p4, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;->viewMode:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

    return-void
.end method


# virtual methods
.method public buildCard()Lcom/usebutton/sdk/purchasepath/Card;
    .locals 4

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;->commissionType:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    iget-object v2, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;->viewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    iget-object v3, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;->viewMode:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/buttonsdk/card/CardBuilder$-CC;->buildCallToAction(Landroid/content/Context;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;)Lcom/usebutton/sdk/purchasepath/CallToAction;

    move-result-object v0

    .line 34
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;->buildViewModel()Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;

    move-result-object v1

    .line 36
    new-instance v2, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;

    invoke-direct {v2, v0, v1}, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;-><init>(Lcom/usebutton/sdk/purchasepath/CallToAction;Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;)V

    return-object v2
.end method

.method public bridge synthetic buildViewModel()Lcom/ibotta/android/buttonsdk/card/customcard/AbstractCustomCardViewModel;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;->buildViewModel()Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;

    move-result-object v0

    return-object v0
.end method

.method public buildViewModel()Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;
    .locals 8

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;->context:Landroid/content/Context;

    const v1, 0x7f110363

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 42
    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;->context:Landroid/content/Context;

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;->viewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    invoke-virtual {v4}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->getRetailerName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const v4, 0x7f1103f5

    invoke-virtual {v1, v4, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 43
    iget-object v3, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;->context:Landroid/content/Context;

    const v4, 0x7f1104a1

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 44
    iget-object v4, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;->context:Landroid/content/Context;

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    iget-object v7, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;->viewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    .line 46
    invoke-virtual {v7}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->getRetailerName()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v5

    iget-object v5, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;->viewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    .line 47
    invoke-virtual {v5}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->getPendingPeriod()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v6, v2

    const v2, 0x7f110310

    .line 44
    invoke-virtual {v4, v2, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 49
    new-instance v4, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;

    invoke-direct {v4, v0, v1, v3, v2}, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v4
.end method
