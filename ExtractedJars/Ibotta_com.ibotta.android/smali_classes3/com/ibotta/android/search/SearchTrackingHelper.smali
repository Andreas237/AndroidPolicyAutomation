.class public Lcom/ibotta/android/search/SearchTrackingHelper;
.super Ljava/lang/Object;
.source "SearchTrackingHelper.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static fromType(Ljava/lang/Object;)Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 16
    :cond_0
    instance-of v1, p0, Lcom/ibotta/api/model/OfferModel;

    if-eqz v1, :cond_1

    .line 17
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->OFFER:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    goto :goto_0

    .line 18
    :cond_1
    instance-of v1, p0, Lcom/ibotta/api/model/RetailerModel;

    if-eqz v1, :cond_2

    .line 19
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->RETAILER:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    goto :goto_0

    .line 20
    :cond_2
    instance-of p0, p0, Lcom/ibotta/api/model/BonusModel;

    if-eqz p0, :cond_3

    .line 21
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->BONUS:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    :cond_3
    :goto_0
    return-object v0
.end method

.method public static getId(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 34
    :cond_0
    instance-of v1, p0, Lcom/ibotta/api/model/OfferModel;

    if-eqz v1, :cond_1

    .line 35
    check-cast p0, Lcom/ibotta/api/model/OfferModel;

    invoke-interface {p0}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    .line 36
    :cond_1
    instance-of v1, p0, Lcom/ibotta/api/model/RetailerModel;

    if-eqz v1, :cond_2

    .line 37
    check-cast p0, Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {p0}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    .line 38
    :cond_2
    instance-of v1, p0, Lcom/ibotta/api/model/BonusModel;

    if-eqz v1, :cond_3

    .line 39
    check-cast p0, Lcom/ibotta/api/model/BonusModel;

    invoke-interface {p0}, Lcom/ibotta/api/model/BonusModel;->getId()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_3
    :goto_0
    return-object v0
.end method
