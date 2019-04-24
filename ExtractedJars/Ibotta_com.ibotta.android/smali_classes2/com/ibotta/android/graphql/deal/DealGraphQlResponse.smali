.class public abstract Lcom/ibotta/android/graphql/deal/DealGraphQlResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "DealGraphQlResponse.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    return-void
.end method

.method public static create(Lcom/ibotta/api/model/DealModel;)Lcom/ibotta/android/graphql/deal/DealGraphQlResponse;
    .locals 1

    .line 13
    new-instance v0, Lcom/ibotta/android/graphql/deal/AutoValue_DealGraphQlResponse;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/deal/AutoValue_DealGraphQlResponse;-><init>(Lcom/ibotta/api/model/DealModel;)V

    return-object v0
.end method


# virtual methods
.method public abstract getDealModel()Lcom/ibotta/api/model/DealModel;
.end method
