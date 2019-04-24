.class public interface abstract Lcom/ibotta/api/helper/retailer/RetailerHelper;
.super Ljava/lang/Object;
.source "RetailerHelper.java"


# virtual methods
.method public abstract findNearbyRetailers(Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract findRetailerByDasherizedName(Ljava/util/List;Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/ibotta/api/model/RetailerModel;"
        }
    .end annotation
.end method

.method public abstract findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;I)",
            "Lcom/ibotta/api/model/RetailerModel;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract findRetailersByIds(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getButtonId(Lcom/ibotta/api/model/RetailerModel;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract getRetailersFromBaseContent(Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/BaseContent;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract isLinked(Lcom/ibotta/api/model/RetailerModel;)Z
.end method

.method public abstract isWithinReach(Lcom/ibotta/api/model/RetailerModel;)Z
.end method
