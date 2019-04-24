.class public Lcom/ibotta/api/call/offer/SocialOffersResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "SocialOffersResponse.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 13
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    return-void
.end method
