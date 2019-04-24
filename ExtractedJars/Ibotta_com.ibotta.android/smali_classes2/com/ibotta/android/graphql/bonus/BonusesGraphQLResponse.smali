.class public Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "BonusesGraphQLResponse.java"


# instance fields
.field private availableBonuses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation
.end field

.field private completedBonuses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation
.end field

.field private featuredBonuses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getAllBonuses()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    iget-object v1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;->availableBonuses:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 48
    iget-object v1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;->completedBonuses:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public getAvailableBonuses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;->availableBonuses:Ljava/util/List;

    return-object v0
.end method

.method public getCompletedBonuses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;->completedBonuses:Ljava/util/List;

    return-object v0
.end method

.method public getFeaturedBonuses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;->featuredBonuses:Ljava/util/List;

    return-object v0
.end method

.method public setAvailableBonuses(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;)V"
        }
    .end annotation

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;->availableBonuses:Ljava/util/List;

    return-void
.end method

.method public setCompletedBonuses(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;)V"
        }
    .end annotation

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;->completedBonuses:Ljava/util/List;

    return-void
.end method

.method public setFeaturedBonuses(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;)V"
        }
    .end annotation

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;->featuredBonuses:Ljava/util/List;

    return-void
.end method
