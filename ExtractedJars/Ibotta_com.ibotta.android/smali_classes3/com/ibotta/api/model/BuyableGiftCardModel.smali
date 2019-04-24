.class public interface abstract Lcom/ibotta/api/model/BuyableGiftCardModel;
.super Ljava/lang/Object;
.source "BuyableGiftCardModel.java"

# interfaces
.implements Lcom/ibotta/api/ContentEventTrackable;
.implements Lcom/ibotta/api/model/ContentModel;
.implements Lcom/ibotta/api/model/base/Routable;


# virtual methods
.method public abstract getDescription()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getEndTime()Ljava/util/Date;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getImageUrl()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getMaxPurchaseAmount()F
.end method

.method public abstract getMinPurchaseAmount()F
.end method

.method public abstract getPreconfiguredAmounts()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRetailerId()I
.end method

.method public abstract getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRetailerSku()Ljava/lang/String;
.end method

.method public abstract getRewardPercentage()F
.end method

.method public abstract getStartTime()Ljava/util/Date;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getTerms()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract isLaunch()Z
.end method
