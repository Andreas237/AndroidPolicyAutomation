.class public Lcom/ibotta/api/call/offer/BaseOffersV2Response;
.super Lcom/ibotta/api/StraightToDiskCacheablekApiResponse;
.source "BaseOffersV2Response.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/ibotta/api/StraightToDiskCacheablekApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 12
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/StraightToDiskCacheablekApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    return-void
.end method
