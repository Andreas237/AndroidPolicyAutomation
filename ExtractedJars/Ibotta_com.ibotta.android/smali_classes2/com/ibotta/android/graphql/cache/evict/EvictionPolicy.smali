.class public interface abstract Lcom/ibotta/android/graphql/cache/evict/EvictionPolicy;
.super Ljava/lang/Object;
.source "EvictionPolicy.java"


# virtual methods
.method public abstract evictContentIfNeeded(Lcom/ibotta/android/graphql/GraphQLApiResponse;)V
.end method

.method public abstract shouldEvict(Ljava/lang/String;Lcom/apollographql/apollo/cache/normalized/Record;)Z
.end method
