.class Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data$Mapper$1;
.super Ljava/lang/Object;
.source "CategoryGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseReader$ObjectReader<",
        "Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data$Mapper;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data$Mapper;)V
    .locals 0

    .line 295
    iput-object p1, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data$Mapper$1;->this$0:Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data$Mapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;
    .locals 1

    .line 298
    iget-object v0, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data$Mapper$1;->this$0:Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data$Mapper;

    iget-object v0, v0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data$Mapper;->categoryFieldMapper:Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category$Mapper;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic read(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 295
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data$Mapper$1;->read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;

    move-result-object p1

    return-object p1
.end method
