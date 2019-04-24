.class public abstract Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "BuyableGiftCardEarningByIdResponse.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse$Builder;
    .locals 1

    .line 16
    new-instance v0, Lcom/ibotta/api/call/customer/earnings/AutoValue_BuyableGiftCardEarningByIdResponse$Builder;

    invoke-direct {v0}, Lcom/ibotta/api/call/customer/earnings/AutoValue_BuyableGiftCardEarningByIdResponse$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getEarning()Lcom/ibotta/api/model/earnings/Earning;
.end method
