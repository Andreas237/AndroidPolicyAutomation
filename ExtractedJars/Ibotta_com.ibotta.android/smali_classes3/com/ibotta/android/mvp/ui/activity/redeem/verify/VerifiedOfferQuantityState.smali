.class public abstract Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;
.super Ljava/lang/Object;
.source "VerifiedOfferQuantityState.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState$Builder;
    .locals 1

    .line 16
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getExpectedQuantity()I
.end method

.method public abstract getOfferId()I
.end method
