.class public Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "CurrentSocialBonusesGraphQLResponse.java"


# instance fields
.field private bonuses:Ljava/util/List;
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

    .line 12
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getBonuses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLResponse;->bonuses:Ljava/util/List;

    return-object v0
.end method

.method public setBonuses(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;)V"
        }
    .end annotation

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLResponse;->bonuses:Ljava/util/List;

    return-void
.end method
