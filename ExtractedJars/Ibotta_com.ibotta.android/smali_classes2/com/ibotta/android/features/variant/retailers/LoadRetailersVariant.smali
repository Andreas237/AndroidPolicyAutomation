.class public interface abstract Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;
.super Ljava/lang/Object;
.source "LoadRetailersVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/Variant;


# virtual methods
.method public abstract getRetailerModels(Lcom/ibotta/api/ApiResponse;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/ApiResponse;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRetailersApiJob(Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;)Lcom/ibotta/android/service/api/job/SingleApiJob;
.end method

.method public abstract isGraphQlVariant()Z
.end method

.method public abstract isRetailersApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)Z
.end method
