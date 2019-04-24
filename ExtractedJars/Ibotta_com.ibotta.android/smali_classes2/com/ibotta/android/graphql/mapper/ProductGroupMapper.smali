.class public Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "ProductGroupMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;",
        "Lcom/ibotta/api/model/offer/ProductGroup;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-void
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;)Lcom/ibotta/api/model/offer/ProductGroup;
    .locals 2
    .param p1    # Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 27
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/offer/ProductGroup;

    invoke-direct {v0}, Lcom/ibotta/api/model/offer/ProductGroup;-><init>()V

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;->asInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/offer/ProductGroup;->setId(I)V

    .line 31
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->multiples()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/offer/ProductGroup;->setMultiples(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/offer/ProductGroup;->setName(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->ignore_barcode()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/offer/ProductGroup;->setIgnoreBarcode(Z)V

    .line 34
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->multiples_count()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;->asShort(Ljava/lang/Number;)S

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/offer/ProductGroup;->setMultiplesCount(S)V

    .line 35
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->random_weight()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/offer/ProductGroup;->setRandomWeight(Z)V

    .line 36
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->random_weight_total()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;->asFloat(Ljava/lang/Number;)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/offer/ProductGroup;->setRandomWeightTotal(F)V

    .line 38
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->products()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 39
    new-instance v1, Ljava/util/HashSet;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->products()Ljava/util/List;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 40
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/offer/ProductGroup;->setProducts(Ljava/util/Set;)V

    :cond_1
    return-object v0
.end method

.method public bridge synthetic map(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 16
    check-cast p1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;->map(Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;)Lcom/ibotta/api/model/offer/ProductGroup;

    move-result-object p1

    return-object p1
.end method
