.class public Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "CustomerFavoriteRetailerMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;",
        "Lcom/ibotta/api/model/content/RetailerContent;",
        ">;"
    }
.end annotation


# instance fields
.field private final retailerNodeMapper:Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    .line 19
    iput-object p2, p0, Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;->retailerNodeMapper:Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;

    return-void
.end method

.method static synthetic lambda$map$0(Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;)Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;
    .locals 0

    .line 29
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;->fragments()Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer$Fragments;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer$Fragments;->retailerNodeFragment()Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;)Lcom/ibotta/api/model/content/RetailerContent;
    .locals 3
    .param p1    # Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 24
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->retailer()Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->retailer()Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;->fragments()Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer$Fragments;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->retailer()Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;

    move-result-object v1

    .line 28
    invoke-static {v1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/graphql/mapper/-$$Lambda$CustomerFavoriteRetailerMapper$qkSWajYUvaHZ-iYemWQarQFxebI;->INSTANCE:Lcom/ibotta/android/graphql/mapper/-$$Lambda$CustomerFavoriteRetailerMapper$qkSWajYUvaHZ-iYemWQarQFxebI;

    .line 29
    invoke-virtual {v1, v2}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;

    .line 31
    iget-object v2, p0, Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;->retailerNodeMapper:Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;->map(Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;)Lcom/ibotta/api/model/content/RetailerContent;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    .line 37
    :cond_1
    new-instance v0, Lcom/ibotta/api/model/customer/FavoriteRetailer;

    invoke-direct {v0}, Lcom/ibotta/api/model/customer/FavoriteRetailer;-><init>()V

    .line 38
    invoke-virtual {v1}, Lcom/ibotta/api/model/content/RetailerContent;->getId()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/model/customer/FavoriteRetailer;->setRetailerId(I)V

    .line 39
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->favoriteDate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;->asDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/model/customer/FavoriteRetailer;->setFavoritedDate(Ljava/util/Date;)V

    .line 40
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->sortOrder()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;->asInt(Ljava/lang/Number;)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/customer/FavoriteRetailer;->setSortOrder(I)V

    const/4 p1, 0x1

    .line 41
    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/customer/FavoriteRetailer;->setFavoritedState(Z)V

    .line 43
    invoke-virtual {v1, v0}, Lcom/ibotta/api/model/content/RetailerContent;->setFavorite(Lcom/ibotta/api/model/customer/FavoriteRetailer;)V

    return-object v1

    :cond_2
    :goto_0
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

    .line 13
    check-cast p1, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;->map(Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;)Lcom/ibotta/api/model/content/RetailerContent;

    move-result-object p1

    return-object p1
.end method
