.class Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper$3;
.super Ljava/lang/Object;
.source "BonusesGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseReader$ObjectReader<",
        "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;)V
    .locals 0

    .line 402
    iput-object p1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper$3;->this$0:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;
    .locals 1

    .line 405
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper$3;->this$0:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;

    iget-object v0, v0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;->featuredBonusesModuleFieldMapper:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule$Mapper;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic read(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 402
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper$3;->read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;

    move-result-object p1

    return-object p1
.end method
