.class public Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardBuilder;
.super Ljava/lang/Object;
.source "SpecialConditionsCustomCardBuilder.java"

# interfaces
.implements Lcom/ibotta/android/buttonsdk/card/customcard/CustomCardBuilder;


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final commissionType:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

.field private final context:Landroid/content/Context;

.field private final viewMode:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

.field private final viewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardBuilder;->context:Landroid/content/Context;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardBuilder;->commissionType:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardBuilder;->viewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    .line 31
    iput-object p4, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardBuilder;->viewMode:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

    .line 32
    iput-object p5, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardBuilder;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method


# virtual methods
.method public buildCard()Lcom/usebutton/sdk/purchasepath/Card;
    .locals 4

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardBuilder;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardBuilder;->commissionType:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    iget-object v2, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardBuilder;->viewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    iget-object v3, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardBuilder;->viewMode:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/buttonsdk/card/CardBuilder$-CC;->buildCallToAction(Landroid/content/Context;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;)Lcom/usebutton/sdk/purchasepath/CallToAction;

    move-result-object v0

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardBuilder;->buildViewModel()Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardViewModel;

    move-result-object v1

    .line 40
    new-instance v2, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCard;

    iget-object v3, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardBuilder;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-direct {v2, v0, v1, v3}, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCard;-><init>(Lcom/usebutton/sdk/purchasepath/CallToAction;Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardViewModel;Lcom/ibotta/android/util/AppHelper;)V

    return-object v2
.end method

.method public bridge synthetic buildViewModel()Lcom/ibotta/android/buttonsdk/card/customcard/AbstractCustomCardViewModel;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardBuilder;->buildViewModel()Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardViewModel;

    move-result-object v0

    return-object v0
.end method

.method public buildViewModel()Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardViewModel;
    .locals 3

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardBuilder;->context:Landroid/content/Context;

    const v1, 0x7f1105df

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 46
    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardBuilder;->viewModel:Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    invoke-virtual {v1}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->getSpecialConditions()Ljava/lang/String;

    move-result-object v1

    .line 47
    new-instance v2, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardViewModel;

    invoke-direct {v2, v0, v1}, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardViewModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method
