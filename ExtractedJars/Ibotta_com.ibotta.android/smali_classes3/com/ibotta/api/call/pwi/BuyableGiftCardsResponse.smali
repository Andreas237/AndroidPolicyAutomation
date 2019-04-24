.class public abstract Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "BuyableGiftCardsResponse.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse$Builder;
    .locals 1

    .line 14
    new-instance v0, Lcom/ibotta/api/call/pwi/AutoValue_BuyableGiftCardsResponse$Builder;

    invoke-direct {v0}, Lcom/ibotta/api/call/pwi/AutoValue_BuyableGiftCardsResponse$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getBgcTransactions()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/pwi/BgcTransaction;",
            ">;"
        }
    .end annotation
.end method
