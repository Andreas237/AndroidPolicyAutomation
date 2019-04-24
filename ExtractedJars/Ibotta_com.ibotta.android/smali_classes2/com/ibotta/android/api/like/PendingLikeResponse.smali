.class public Lcom/ibotta/android/api/like/PendingLikeResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "PendingLikeResponse.java"


# instance fields
.field private offerIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    .line 12
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/api/like/PendingLikeResponse;->offerIds:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 28
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 29
    instance-of v0, p1, Lcom/ibotta/android/api/like/PendingLikeResponse;

    if-eqz v0, :cond_1

    .line 30
    check-cast p1, Lcom/ibotta/android/api/like/PendingLikeResponse;

    iget-object v0, p0, Lcom/ibotta/android/api/like/PendingLikeResponse;->offerIds:Ljava/util/Set;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/api/like/PendingLikeResponse;->setOfferIds(Ljava/util/Set;)V

    :cond_1
    return-void
.end method

.method public getOfferIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/api/like/PendingLikeResponse;->offerIds:Ljava/util/Set;

    return-object v0
.end method

.method public setOfferIds(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/api/like/PendingLikeResponse;->offerIds:Ljava/util/Set;

    return-void
.end method
