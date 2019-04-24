.class public Lcom/ibotta/api/call/offer/OffersResponse;
.super Lcom/ibotta/api/call/offer/BaseOffersV2Response;
.source "OffersResponse.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Lcom/ibotta/api/call/offer/BaseOffersV2Response;-><init>()V

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 11
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/call/offer/BaseOffersV2Response;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    return-void
.end method
