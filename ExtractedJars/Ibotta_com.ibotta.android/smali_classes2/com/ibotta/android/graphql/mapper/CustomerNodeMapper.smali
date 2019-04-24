.class public Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "CustomerNodeMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment;",
        "Lcom/ibotta/api/model/content/CustomerNode;",
        ">;"
    }
.end annotation


# instance fields
.field private final customerFavoriteRetailerMapper:Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;->customerFavoriteRetailerMapper:Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;

    return-void
.end method

.method public static synthetic lambda$map$0(Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;)Lcom/ibotta/api/model/content/RetailerContent;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;->customerFavoriteRetailerMapper:Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;->fragments()Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;->customerFavoriteRetailerFragment()Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;->map(Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;)Lcom/ibotta/api/model/content/RetailerContent;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment;)Lcom/ibotta/api/model/content/CustomerNode;
    .locals 1
    .param p1    # Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 32
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment;->favoriteRetailers()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    .line 33
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 35
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/graphql/mapper/-$$Lambda$CustomerNodeMapper$BwRv0zxNUxkavnzNAuSZmldDfY0;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/mapper/-$$Lambda$CustomerNodeMapper$BwRv0zxNUxkavnzNAuSZmldDfY0;-><init>(Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;)V

    .line 36
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 38
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 40
    invoke-static {}, Lcom/ibotta/api/model/content/CustomerNode;->builder()Lcom/ibotta/api/model/content/CustomerNode$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/content/CustomerNode$Builder;->favoriteRetailers(Ljava/util/List;)Lcom/ibotta/api/model/content/CustomerNode$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/content/CustomerNode$Builder;->build()Lcom/ibotta/api/model/content/CustomerNode;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic map(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 17
    check-cast p1, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;->map(Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment;)Lcom/ibotta/api/model/content/CustomerNode;

    move-result-object p1

    return-object p1
.end method
