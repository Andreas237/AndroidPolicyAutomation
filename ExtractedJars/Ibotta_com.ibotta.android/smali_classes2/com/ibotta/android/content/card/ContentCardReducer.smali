.class public final Lcom/ibotta/android/content/card/ContentCardReducer;
.super Ljava/lang/Object;
.source "ContentCardReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/ibotta/android/content/card/ContentCardReducer;",
        "",
        "buyableGiftCardCardReducer",
        "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;",
        "dealCardReducer",
        "Lcom/ibotta/android/content/card/deal/DealCardReducer;",
        "offerCardReducer",
        "Lcom/ibotta/android/content/card/offer/OfferCardReducer;",
        "(Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;Lcom/ibotta/android/content/card/deal/DealCardReducer;Lcom/ibotta/android/content/card/offer/OfferCardReducer;)V",
        "create",
        "Lcom/ibotta/android/content/card/ContentCardViewState;",
        "displayContent",
        "Lcom/ibotta/android/content/DisplayContent;",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final buyableGiftCardCardReducer:Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;

.field private final dealCardReducer:Lcom/ibotta/android/content/card/deal/DealCardReducer;

.field private final offerCardReducer:Lcom/ibotta/android/content/card/offer/OfferCardReducer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;Lcom/ibotta/android/content/card/deal/DealCardReducer;Lcom/ibotta/android/content/card/offer/OfferCardReducer;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/content/card/deal/DealCardReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/content/card/offer/OfferCardReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "buyableGiftCardCardReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dealCardReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offerCardReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/content/card/ContentCardReducer;->buyableGiftCardCardReducer:Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;

    iput-object p2, p0, Lcom/ibotta/android/content/card/ContentCardReducer;->dealCardReducer:Lcom/ibotta/android/content/card/deal/DealCardReducer;

    iput-object p3, p0, Lcom/ibotta/android/content/card/ContentCardReducer;->offerCardReducer:Lcom/ibotta/android/content/card/offer/OfferCardReducer;

    return-void
.end method


# virtual methods
.method public final create(Lcom/ibotta/android/content/DisplayContent;)Lcom/ibotta/android/content/card/ContentCardViewState;
    .locals 8
    .param p1    # Lcom/ibotta/android/content/DisplayContent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "displayContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    instance-of v0, p1, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardReducer;->buyableGiftCardCardReducer:Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;

    .line 18
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;

    invoke-virtual {v1}, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->getBuyableGiftCardModel()Lcom/ibotta/api/model/BuyableGiftCardModel;

    move-result-object v2

    .line 19
    invoke-virtual {v1}, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v1

    .line 20
    invoke-virtual {p1}, Lcom/ibotta/android/content/DisplayContent;->getContentStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object p1

    .line 17
    invoke-virtual {v0, v2, v1, p1}, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;->create(Lcom/ibotta/api/model/BuyableGiftCardModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/content/card/ContentCardViewState;

    move-result-object p1

    goto :goto_0

    .line 21
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/content/DealDisplayContent;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/content/card/ContentCardReducer;->dealCardReducer:Lcom/ibotta/android/content/card/deal/DealCardReducer;

    .line 22
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/content/DealDisplayContent;

    invoke-virtual {v1}, Lcom/ibotta/android/content/DealDisplayContent;->getDealModel()Lcom/ibotta/api/model/DealModel;

    move-result-object v2

    .line 23
    invoke-virtual {v1}, Lcom/ibotta/android/content/DealDisplayContent;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v1

    .line 24
    invoke-virtual {p1}, Lcom/ibotta/android/content/DisplayContent;->getContentStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object p1

    .line 21
    invoke-virtual {v0, v2, v1, p1}, Lcom/ibotta/android/content/card/deal/DealCardReducer;->create(Lcom/ibotta/api/model/DealModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/content/card/ContentCardViewState;

    move-result-object p1

    goto :goto_0

    .line 25
    :cond_1
    instance-of v0, p1, Lcom/ibotta/android/content/OfferDisplayContent;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/content/card/ContentCardReducer;->offerCardReducer:Lcom/ibotta/android/content/card/offer/OfferCardReducer;

    .line 26
    move-object v0, p1

    check-cast v0, Lcom/ibotta/android/content/OfferDisplayContent;

    invoke-virtual {v0}, Lcom/ibotta/android/content/OfferDisplayContent;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v2

    .line 27
    invoke-virtual {v0}, Lcom/ibotta/android/content/OfferDisplayContent;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v3

    .line 28
    invoke-virtual {p1}, Lcom/ibotta/android/content/DisplayContent;->getContentStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object v4

    .line 29
    invoke-virtual {v0}, Lcom/ibotta/android/content/OfferDisplayContent;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v5

    .line 30
    invoke-virtual {v0}, Lcom/ibotta/android/content/OfferDisplayContent;->isEditing()Z

    move-result v6

    .line 31
    invoke-virtual {v0}, Lcom/ibotta/android/content/OfferDisplayContent;->isSelected()Z

    move-result v7

    .line 25
    invoke-virtual/range {v1 .. v7}, Lcom/ibotta/android/content/card/offer/OfferCardReducer;->create(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;Lcom/ibotta/api/model/customer/Customer;ZZ)Lcom/ibotta/android/content/card/ContentCardViewState;

    move-result-object p1

    :goto_0
    return-object p1

    .line 32
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Invalid Content Type for ContentCardReducer"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method
