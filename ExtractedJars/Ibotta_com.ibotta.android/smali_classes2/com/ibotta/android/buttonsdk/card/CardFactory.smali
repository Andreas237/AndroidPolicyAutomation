.class public Lcom/ibotta/android/buttonsdk/card/CardFactory;
.super Ljava/lang/Object;
.source "CardFactory.java"


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/card/CardFactory;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public createCard(Lcom/ibotta/android/buttonsdk/card/CardType;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;Lcom/ibotta/android/util/AppHelper;)Lcom/usebutton/sdk/purchasepath/Card;
    .locals 7

    .line 30
    sget-object v0, Lcom/ibotta/android/buttonsdk/card/CardFactory$1;->$SwitchMap$com$ibotta$android$buttonsdk$card$CardType:[I

    invoke-virtual {p1}, Lcom/ibotta/android/buttonsdk/card/CardType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 45
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Invalid CardType passed to CardFactory"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 41
    :pswitch_0
    new-instance p1, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardBuilder;

    iget-object v2, p0, Lcom/ibotta/android/buttonsdk/card/CardFactory;->context:Landroid/content/Context;

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardBuilder;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;Lcom/ibotta/android/util/AppHelper;)V

    .line 42
    invoke-virtual {p1}, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardBuilder;->buildCard()Lcom/usebutton/sdk/purchasepath/Card;

    move-result-object p1

    goto :goto_0

    .line 38
    :pswitch_1
    new-instance p1, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;

    iget-object p5, p0, Lcom/ibotta/android/buttonsdk/card/CardFactory;->context:Landroid/content/Context;

    invoke-direct {p1, p5, p2, p3, p4}, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;)V

    invoke-virtual {p1}, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardBuilder;->buildCard()Lcom/usebutton/sdk/purchasepath/Card;

    move-result-object p1

    goto :goto_0

    .line 35
    :pswitch_2
    new-instance p1, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;

    iget-object p5, p0, Lcom/ibotta/android/buttonsdk/card/CardFactory;->context:Landroid/content/Context;

    invoke-direct {p1, p5, p2, p3, p4}, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;)V

    invoke-virtual {p1}, Lcom/ibotta/android/buttonsdk/card/textcard/ProductTextCardBuilder;->buildCard()Lcom/usebutton/sdk/purchasepath/Card;

    move-result-object p1

    goto :goto_0

    .line 32
    :pswitch_3
    new-instance p1, Lcom/ibotta/android/buttonsdk/card/textcard/RetailerTextCardBuilder;

    iget-object p5, p0, Lcom/ibotta/android/buttonsdk/card/CardFactory;->context:Landroid/content/Context;

    invoke-direct {p1, p5, p2, p3, p4}, Lcom/ibotta/android/buttonsdk/card/textcard/RetailerTextCardBuilder;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;)V

    invoke-virtual {p1}, Lcom/ibotta/android/buttonsdk/card/textcard/RetailerTextCardBuilder;->buildCard()Lcom/usebutton/sdk/purchasepath/Card;

    move-result-object p1

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
