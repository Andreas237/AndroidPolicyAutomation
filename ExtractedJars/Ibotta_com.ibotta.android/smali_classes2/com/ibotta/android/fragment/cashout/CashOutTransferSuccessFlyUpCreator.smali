.class public Lcom/ibotta/android/fragment/cashout/CashOutTransferSuccessFlyUpCreator;
.super Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;
.source "CashOutTransferSuccessFlyUpCreator.java"


# instance fields
.field private final type:Lcom/ibotta/api/model/customer/CustomerAccount$Type;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator$OnePageFlyUpCreatorListener;Lcom/ibotta/api/model/customer/CustomerAccount$Type;)V
    .locals 1

    const v0, 0x7f0c00e4

    .line 22
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator$OnePageFlyUpCreatorListener;I)V

    .line 23
    iput-object p3, p0, Lcom/ibotta/android/fragment/cashout/CashOutTransferSuccessFlyUpCreator;->type:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    return-void
.end method


# virtual methods
.method public makeFlyUpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;
    .locals 6

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/fragment/cashout/CashOutTransferSuccessFlyUpCreator;->type:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->VENMO:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    if-ne v0, v1, :cond_0

    .line 30
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    const v1, 0x7f110209

    invoke-virtual {v0, v1}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 31
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/cashout/CashOutTransferSuccessFlyUpCreator;->type:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->PAYPAL:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    if-ne v0, v1, :cond_1

    .line 32
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    const v1, 0x7f1101d1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const v1, 0x7f090450

    .line 34
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/view/common/TextContainerView;

    .line 35
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v2

    const v3, 0x7f1102d5

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Lcom/ibotta/android/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 34
    invoke-virtual {v1, v0}, Lcom/ibotta/android/view/common/TextContainerView;->setBody(Ljava/lang/String;)V

    .line 38
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;->makeFlyUpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;

    move-result-object p1

    return-object p1
.end method
