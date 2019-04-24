.class public interface abstract Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;
.super Ljava/lang/Object;
.source "AlsoBoughtViewedVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/Variant;


# virtual methods
.method public abstract cancelOptionalWaitingApiJob(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;)V
.end method

.method public abstract createOptionalWaitingApiJob()Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract executeOptionalWaitingApiJob(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;)V
.end method

.method public abstract getType()Lcom/ibotta/android/content/spotlight/VariantType;
.end method

.method public abstract onSpotlightOfferLoaded(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;)V
    .param p2    # Lcom/ibotta/api/model/OfferModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setOfferIdOnApiCall(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;Ljava/lang/Integer;)V
.end method

.method public abstract setRetailerIdOnApiCall(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;Ljava/lang/Integer;)V
.end method
