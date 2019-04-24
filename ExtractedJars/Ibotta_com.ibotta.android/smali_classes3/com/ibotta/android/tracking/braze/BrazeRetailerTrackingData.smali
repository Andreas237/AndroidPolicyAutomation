.class public abstract Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;
.super Ljava/lang/Object;
.source "BrazeRetailerTrackingData.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;
    }
.end annotation


# static fields
.field public static EMPTY:Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    invoke-static {}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->builder()Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;->build()Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->EMPTY:Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;
    .locals 2

    .line 18
    new-instance v0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData$Builder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData$Builder;->id(I)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;->auxiliaryLoyaltyEnabled(Z)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract getId()I
.end method

.method public abstract getName()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getShortDescription()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getVerificationTypeApiName()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract isAuxiliaryLoyaltyEnabled()Z
.end method
