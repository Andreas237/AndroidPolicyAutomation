.class public Lcom/ibotta/api/call/offer/MyRebatesResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "MyRebatesResponse.java"


# instance fields
.field private activeRetailers:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    .line 8
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/offer/MyRebatesResponse;->activeRetailers:Ljava/util/LinkedHashSet;

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 23
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 24
    instance-of v0, p1, Lcom/ibotta/api/call/offer/MyRebatesResponse;

    if-eqz v0, :cond_1

    .line 25
    check-cast p1, Lcom/ibotta/api/call/offer/MyRebatesResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/offer/MyRebatesResponse;->activeRetailers:Ljava/util/LinkedHashSet;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/offer/MyRebatesResponse;->setActiveRetailers(Ljava/util/LinkedHashSet;)V

    :cond_1
    return-void
.end method

.method public getActiveRetailers()Ljava/util/LinkedHashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/ibotta/api/call/offer/MyRebatesResponse;->activeRetailers:Ljava/util/LinkedHashSet;

    return-object v0
.end method

.method public setActiveRetailers(Ljava/util/LinkedHashSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 15
    iput-object p1, p0, Lcom/ibotta/api/call/offer/MyRebatesResponse;->activeRetailers:Ljava/util/LinkedHashSet;

    return-void
.end method
