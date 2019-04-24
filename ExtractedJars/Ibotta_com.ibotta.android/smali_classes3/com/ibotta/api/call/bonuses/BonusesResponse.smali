.class public Lcom/ibotta/api/call/bonuses/BonusesResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "BonusesResponse.java"


# instance fields
.field private bonuses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/bonus/Bonus;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/bonuses/BonusesResponse;->bonuses:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 36
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 37
    instance-of v0, p1, Lcom/ibotta/api/call/bonuses/BonusesResponse;

    if-eqz v0, :cond_1

    .line 38
    check-cast p1, Lcom/ibotta/api/call/bonuses/BonusesResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/bonuses/BonusesResponse;->bonuses:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/bonuses/BonusesResponse;->setBonuses(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public getBonuses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/bonus/Bonus;",
            ">;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/ibotta/api/call/bonuses/BonusesResponse;->bonuses:Ljava/util/List;

    return-object v0
.end method

.method public getBonusesAsModels()Ljava/util/List;
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/ibotta/api/call/bonuses/BonusesResponse;->bonuses:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public setBonuses(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/bonus/Bonus;",
            ">;)V"
        }
    .end annotation

    .line 22
    iput-object p1, p0, Lcom/ibotta/api/call/bonuses/BonusesResponse;->bonuses:Ljava/util/List;

    return-void
.end method
