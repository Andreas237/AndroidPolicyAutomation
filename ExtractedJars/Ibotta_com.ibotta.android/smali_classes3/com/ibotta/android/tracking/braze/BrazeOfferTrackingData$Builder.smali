.class public abstract Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
.super Ljava/lang/Object;
.source "BrazeOfferTrackingData.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract amount(F)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
.end method

.method public abstract build()Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;
.end method

.method public abstract description(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract expiration(Ljava/util/Date;)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
    .param p1    # Ljava/util/Date;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract id(I)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
.end method

.method public abstract name(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract offerImage(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract redemptionMax(S)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
.end method

.method public abstract shareUrl(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method
