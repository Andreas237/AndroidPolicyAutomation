.class public abstract Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;
.super Ljava/lang/Object;
.source "BrazeRetailerTrackingData.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract auxiliaryLoyaltyEnabled(Z)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;
.end method

.method public abstract build()Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;
.end method

.method public abstract id(I)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;
.end method

.method public abstract name(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract shortDescription(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract verificationTypeApiName(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method
