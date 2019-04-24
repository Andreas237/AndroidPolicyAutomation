.class public interface abstract Lcom/ibotta/api/helper/feature/FeatureHelper;
.super Ljava/lang/Object;
.source "FeatureHelper.java"


# virtual methods
.method public abstract findById(Ljava/util/List;I)Lcom/ibotta/api/model/feature/Feature;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/feature/Feature;",
            ">;I)",
            "Lcom/ibotta/api/model/feature/Feature;"
        }
    .end annotation
.end method

.method public abstract findByType(Ljava/util/List;Lcom/ibotta/api/model/feature/FeatureType;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/feature/Feature;",
            ">;",
            "Lcom/ibotta/api/model/feature/FeatureType;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/feature/Feature;",
            ">;"
        }
    .end annotation
.end method
