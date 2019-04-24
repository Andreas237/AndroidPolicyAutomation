.class public abstract Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;
.super Ljava/lang/Object;
.source "BrazeOfferTrackingData.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
    }
.end annotation


# static fields
.field public static EMPTY:Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    invoke-static {}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->builder()Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;->build()Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->EMPTY:Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
    .locals 3

    .line 23
    new-instance v0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->id(I)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;->amount(F)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;->redemptionMax(S)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract getAmount()F
.end method

.method public abstract getDescription()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getExpiration()Ljava/util/Date;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getId()I
.end method

.method public abstract getName()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getOfferImage()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRedemptionMax()S
.end method

.method public abstract getShareUrl()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method
