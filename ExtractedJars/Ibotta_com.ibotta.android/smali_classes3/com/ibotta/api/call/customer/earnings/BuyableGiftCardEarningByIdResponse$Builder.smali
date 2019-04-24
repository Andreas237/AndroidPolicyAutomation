.class public abstract Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse$Builder;
.super Ljava/lang/Object;
.source "BuyableGiftCardEarningByIdResponse.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse;
.end method

.method public abstract earning(Lcom/ibotta/api/model/earnings/Earning;)Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse$Builder;
.end method
