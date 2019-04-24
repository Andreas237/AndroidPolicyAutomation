.class public Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowInternalVariant;
.super Ljava/lang/Object;
.source "FlippedFlowInternalVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/ExperimentalVariant;
.implements Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getConnectButtonString(Lcom/ibotta/android/util/AppHelper;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2

    .line 34
    sget p3, Lcom/ibotta/android/features/R$string;->im_connect_button_flipped_flow:I

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-interface {p1, p3, v0}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getConnectLinkString(Lcom/ibotta/android/util/AppHelper;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 39
    sget v0, Lcom/ibotta/android/features/R$string;->im_connect_create_instructions:I

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

    .line 44
    sget v0, Lcom/ibotta/android/features/R$string;->im_connect_create_instructions_linkify:I

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public isFlippedFlow()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public retailerMeetsRedemptionRequirements(Lcom/ibotta/api/helper/offer/OfferHelper;ILcom/ibotta/api/model/common/VerificationType;Ljava/util/List;)Z
    .locals 0
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

    const/4 p1, 0x1

    return p1
.end method
