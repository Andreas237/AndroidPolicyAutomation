.class Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper$2;
.super Ljava/lang/Object;
.source "BonusesGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseReader$ListReader;


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
        "Lcom/apollographql/apollo/api/ResponseReader$ListReader<",
        "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$CompletedBonuse;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;)V
    .locals 0

    .line 391
    iput-object p1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper$2;->this$0:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$CompletedBonuse;
    .locals 1

    .line 394
    new-instance v0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper$2$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper$2$1;-><init>(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper$2;)V

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;->readObject(Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$CompletedBonuse;

    return-object p1
.end method

.method public bridge synthetic read(Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;)Ljava/lang/Object;
    .locals 0

    .line 391
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper$2;->read(Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$CompletedBonuse;

    move-result-object p1

    return-object p1
.end method
