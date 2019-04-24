.class public final Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;
.super Ljava/lang/Object;
.source "BonusesGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field final availableBonuseFieldMapper:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$AvailableBonuse$Mapper;

.field final completedBonuseFieldMapper:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$CompletedBonuse$Mapper;

.field final featuredBonusesModuleFieldMapper:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 371
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 372
    new-instance v0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$AvailableBonuse$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$AvailableBonuse$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;->availableBonuseFieldMapper:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$AvailableBonuse$Mapper;

    .line 374
    new-instance v0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$CompletedBonuse$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$CompletedBonuse$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;->completedBonuseFieldMapper:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$CompletedBonuse$Mapper;

    .line 376
    new-instance v0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;->featuredBonusesModuleFieldMapper:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;
    .locals 4

    .line 380
    sget-object v0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    new-instance v1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper$1;-><init>(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;)V

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v0

    .line 391
    sget-object v1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    new-instance v2, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper$2;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper$2;-><init>(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;)V

    invoke-interface {p1, v1, v2}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v1

    .line 402
    sget-object v2, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    new-instance v3, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper$3;

    invoke-direct {v3, p0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper$3;-><init>(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;)V

    invoke-interface {p1, v2, v3}, Lcom/apollographql/apollo/api/ResponseReader;->readObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;

    .line 408
    new-instance v2, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;

    invoke-direct {v2, v0, v1, p1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;-><init>(Ljava/util/List;Ljava/util/List;Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;)V

    return-object v2
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 371
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;

    move-result-object p1

    return-object p1
.end method
