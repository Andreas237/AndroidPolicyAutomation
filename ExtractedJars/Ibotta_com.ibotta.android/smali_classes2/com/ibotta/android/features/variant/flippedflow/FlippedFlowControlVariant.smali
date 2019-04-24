.class public Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowControlVariant;
.super Ljava/lang/Object;
.source "FlippedFlowControlVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/ControlVariant;
.implements Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getConnectButtonString(Lcom/ibotta/android/util/AppHelper;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p3, :cond_0

    .line 42
    sget p3, Lcom/ibotta/android/features/R$string;->im_connect_button:I

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p2, v1, v0

    invoke-interface {p1, p3, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 44
    :cond_0
    sget p3, Lcom/ibotta/android/features/R$string;->im_login_account_creation_disabled_button:I

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p2, v1, v0

    invoke-interface {p1, p3, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getConnectLinkString(Lcom/ibotta/android/util/AppHelper;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 49
    sget v0, Lcom/ibotta/android/features/R$string;->im_connect_login_instructions:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getConnectLinkifyString(Lcom/ibotta/android/util/AppHelper;)Ljava/lang/String;
    .locals 2

    .line 54
    sget v0, Lcom/ibotta/android/features/R$string;->im_connect_login_instructions_linkify:I

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public isFlippedFlow()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public retailerMeetsRedemptionRequirements(Lcom/ibotta/api/helper/offer/OfferHelper;ILcom/ibotta/api/model/common/VerificationType;Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            "I",
            "Lcom/ibotta/api/model/common/VerificationType;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)Z"
        }
    .end annotation

    if-eqz p4, :cond_2

    .line 28
    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 31
    :cond_0
    sget-object v0, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    const/4 v1, 0x1

    if-ne p3, v0, :cond_1

    return v1

    .line 35
    :cond_1
    invoke-interface {p1, p4, p2}, Lcom/ibotta/api/helper/offer/OfferHelper;->findActiveByRetailer(Ljava/util/List;I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
