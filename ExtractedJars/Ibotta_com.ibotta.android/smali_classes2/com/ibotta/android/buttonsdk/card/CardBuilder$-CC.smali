.class public final synthetic Lcom/ibotta/android/buttonsdk/card/CardBuilder$-CC;
.super Ljava/lang/Object;
.source "CardBuilder.java"


# direct methods
.method public static buildCallToAction(Landroid/content/Context;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;)Lcom/usebutton/sdk/purchasepath/CallToAction;
    .locals 2

    .line 21
    invoke-static {p1}, Lcom/ibotta/android/buttonsdk/card/CardBuilder$-CC;->getCallToActionIcon(Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;)I

    move-result v0

    .line 22
    invoke-static {p1}, Lcom/ibotta/android/buttonsdk/card/CardBuilder$-CC;->getCallToActionTextColor(Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;)I

    move-result v1

    .line 23
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/buttonsdk/card/CardBuilder$-CC;->getCallToActionText(Landroid/content/Context;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;)Ljava/lang/String;

    move-result-object p1

    .line 25
    new-instance p2, Lcom/usebutton/sdk/purchasepath/CallToAction;

    invoke-static {p0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p0

    invoke-direct {p2, v0, p1, p0}, Lcom/usebutton/sdk/purchasepath/CallToAction;-><init>(ILjava/lang/String;I)V

    return-object p2
.end method

.method public static getCallToActionIcon(Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;)I
    .locals 1

    .line 29
    sget-object v0, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->COMMISSIONABLE:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    if-ne p0, v0, :cond_0

    const p0, 0x7f080202

    goto :goto_0

    :cond_0
    const p0, 0x7f080203

    :goto_0
    return p0
.end method

.method public static getCallToActionText(Landroid/content/Context;Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;)Ljava/lang/String;
    .locals 2

    const v0, 0x7f110443

    .line 51
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 52
    sget-object v1, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->COMMISSIONABLE:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    if-ne p1, v1, :cond_1

    .line 53
    sget-object p1, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;->PRODUCT:Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension$ViewMode;

    if-ne p3, p1, :cond_0

    const p1, 0x7f11012a

    const/4 p3, 0x1

    .line 54
    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    .line 55
    invoke-virtual {p2}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->getCashBackString()Ljava/lang/String;

    move-result-object p2

    aput-object p2, p3, v0

    .line 54
    invoke-virtual {p0, p1, p3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {p2}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->getCashBackString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static getCallToActionTextColor(Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;)I
    .locals 1

    .line 35
    sget-object v0, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->COMMISSIONABLE:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    if-ne p0, v0, :cond_0

    const p0, 0x7f060027

    goto :goto_0

    :cond_0
    const p0, 0x7f0600c5

    :goto_0
    return p0
.end method

.method public static getTextCardBackgroundColor(Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;)I
    .locals 1

    .line 41
    sget-object v0, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->COMMISSIONABLE:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    if-ne p0, v0, :cond_0

    const p0, 0x7f060027

    goto :goto_0

    :cond_0
    const p0, 0x7f0600c5

    :goto_0
    return p0
.end method
