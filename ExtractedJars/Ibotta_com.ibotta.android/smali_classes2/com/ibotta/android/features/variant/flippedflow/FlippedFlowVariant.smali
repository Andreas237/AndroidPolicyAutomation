.class public interface abstract Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;
.super Ljava/lang/Object;
.source "FlippedFlowVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/Variant;


# virtual methods
.method public abstract getConnectButtonString(Lcom/ibotta/android/util/AppHelper;Ljava/lang/String;Z)Ljava/lang/String;
.end method

.method public abstract getConnectLinkString(Lcom/ibotta/android/util/AppHelper;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract getConnectLinkifyString(Lcom/ibotta/android/util/AppHelper;)Ljava/lang/String;
.end method

.method public abstract isFlippedFlow()Z
.end method

.method public abstract retailerMeetsRedemptionRequirements(Lcom/ibotta/api/helper/offer/OfferHelper;ILcom/ibotta/api/model/common/VerificationType;Ljava/util/List;)Z
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
.end method
