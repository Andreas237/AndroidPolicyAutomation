.class public interface abstract Lcom/ibotta/android/graphql/GraphQLApiCall;
.super Ljava/lang/Object;
.source "GraphQLApiCall.java"

# interfaces
.implements Lcom/ibotta/api/ApiCall;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Lcom/ibotta/android/graphql/GraphQLApiResponse;",
        "D::",
        "Lcom/apollographql/apollo/api/Operation$Data;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/ibotta/api/ApiCall<",
        "TR;>;"
    }
.end annotation


# virtual methods
.method public abstract createApolloCall()Lcom/apollographql/apollo/ApolloCall;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/ApolloCall<",
            "TD;>;"
        }
    .end annotation
.end method

.method public abstract getDirectives()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getQueryName()Ljava/lang/String;
.end method
