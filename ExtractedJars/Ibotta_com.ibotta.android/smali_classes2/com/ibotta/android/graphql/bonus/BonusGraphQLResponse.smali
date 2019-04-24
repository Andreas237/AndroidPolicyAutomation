.class public Lcom/ibotta/android/graphql/bonus/BonusGraphQLResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "BonusGraphQLResponse.java"


# instance fields
.field private bonus:Lcom/ibotta/api/model/BonusModel;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getBonus()Lcom/ibotta/api/model/BonusModel;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/ibotta/android/graphql/bonus/BonusGraphQLResponse;->bonus:Lcom/ibotta/api/model/BonusModel;

    return-object v0
.end method

.method public setBonus(Lcom/ibotta/api/model/BonusModel;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/graphql/bonus/BonusGraphQLResponse;->bonus:Lcom/ibotta/api/model/BonusModel;

    return-void
.end method
