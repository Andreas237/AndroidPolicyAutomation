.class public Lcom/ibotta/api/helper/feature/FeatureHelperImpl;
.super Ljava/lang/Object;
.source "FeatureHelperImpl.java"

# interfaces
.implements Lcom/ibotta/api/helper/feature/FeatureHelper;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public findById(Ljava/util/List;I)Lcom/ibotta/api/model/feature/Feature;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/feature/Feature;",
            ">;I)",
            "Lcom/ibotta/api/model/feature/Feature;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 39
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/feature/Feature;

    .line 40
    invoke-virtual {v1}, Lcom/ibotta/api/model/feature/Feature;->getId()I

    move-result v2

    if-ne v2, p2, :cond_1

    move-object v0, v1

    :cond_2
    return-object v0
.end method

.method public findByType(Ljava/util/List;Lcom/ibotta/api/model/feature/FeatureType;)Ljava/util/List;
    .locals 3
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

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_1

    .line 22
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/feature/Feature;

    .line 23
    invoke-virtual {v1}, Lcom/ibotta/api/model/feature/Feature;->getFeatureTypeEnum()Lcom/ibotta/api/model/feature/FeatureType;

    move-result-object v2

    if-ne v2, p2, :cond_1

    .line 24
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    return-object v0
.end method
