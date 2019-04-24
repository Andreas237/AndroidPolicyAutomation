.class public interface abstract Lcom/ibotta/android/braze/BrazeTrackingDataFactory;
.super Ljava/lang/Object;
.source "BrazeTrackingDataFactory.java"


# virtual methods
.method public abstract createBonusTrackingData(Lcom/ibotta/api/model/BonusModel;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;
    .param p1    # Lcom/ibotta/api/model/BonusModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract createBonusTrackingData(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;
    .param p1    # Lcom/ibotta/api/model/OfferModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract createOfferTrackingData(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;
    .param p1    # Lcom/ibotta/api/model/OfferModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract createRetailerTrackingData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method
