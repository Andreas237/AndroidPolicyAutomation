.class public final Lcom/ibotta/android/graphql/RetailerCategoryQuery;
.super Ljava/lang/Object;
.source "RetailerCategoryQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Query;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode;,
        Lcom/ibotta/android/graphql/RetailerCategoryQuery$RetailerCategoryNode;,
        Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;,
        Lcom/ibotta/android/graphql/RetailerCategoryQuery$Variables;,
        Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/Query<",
        "Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;",
        "Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;",
        "Lcom/ibotta/android/graphql/RetailerCategoryQuery$Variables;",
        ">;"
    }
.end annotation


# static fields
.field public static final OPERATION_DEFINITION:Ljava/lang/String; = "query RetailerCategory($customerId: ID!, $categoryIds: [ID]!, $includeFullResponse: Boolean = true, $categoryRetailersLimit: Int = 1000) {\n  retailerCategoryNodes(filters: {ids: {ids: $categoryIds}}) {\n    __typename\n    ...RetailerCategoryNodeFragment\n  }\n  customerNode(filters: {id: $customerId}) {\n    __typename\n    ...CustomerNodeFragment\n  }\n}"

.field public static final OPERATION_ID:Ljava/lang/String; = "46800b58736abf42ddff842c2658a6bda083010bd4cd2fc8a7ac6e2645eba407"

.field public static final OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

.field public static final QUERY_DOCUMENT:Ljava/lang/String; = "query RetailerCategory($customerId: ID!, $categoryIds: [ID]!, $includeFullResponse: Boolean = true, $categoryRetailersLimit: Int = 1000) {\n  retailerCategoryNodes(filters: {ids: {ids: $categoryIds}}) {\n    __typename\n    ...RetailerCategoryNodeFragment\n  }\n  customerNode(filters: {id: $customerId}) {\n    __typename\n    ...CustomerNodeFragment\n  }\n}\nfragment CustomerFavoriteRetailerFragment on CustomerFavoriteRetailer {\n  __typename\n  retailerId\n  favoriteDate\n  sortOrder\n  retailer {\n    __typename\n    ...RetailerNodeFragment\n  }\n}\nfragment CustomerNodeFragment on CustomerNode {\n  __typename\n  favoriteRetailers {\n    __typename\n    ...CustomerFavoriteRetailerFragment\n  }\n}\nfragment FeaturedBannerNodeFragment on FeaturedBannerNode {\n  __typename\n  id\n  name\n  link\n  categoryImg: image(type: CATEGORY) {\n    __typename\n    url\n  }\n}\nfragment FeaturedNodeFragment on FeaturedNode {\n  __typename\n  retailers {\n    __typename\n    ...RetailerNodeFragment\n  }\n  banners {\n    __typename\n    ...FeaturedBannerNodeFragment\n  }\n}\nfragment RetailerCategoryNodeFragment on RetailerCategoryNode {\n  __typename\n  id\n  name\n  iconUrl: image(type: ICON) {\n    __typename\n    url\n  }\n  retailers(limit: {limit: $categoryRetailersLimit}, filters: {primaryOrSecondaryMatch: {enabled: true}}) {\n    __typename\n    ...RetailerNodeFragment\n  }\n  features @include(if: $includeFullResponse) {\n    __typename\n    ...FeaturedNodeFragment\n  }\n}\nfragment RetailerNodeFragment on RetailerNode {\n  __typename\n  id\n  name\n  modelCImage: image(type: MODEL_C) {\n    __typename\n    url\n  }\n  nearby\n  verificationType\n}"


# instance fields
.field private final variables:Lcom/ibotta/android/graphql/RetailerCategoryQuery$Variables;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 62
    new-instance v0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$1;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/RetailerCategoryQuery$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/graphql/RetailerCategoryQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p3    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p4    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "customerId == null"

    .line 73
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "categoryIds == null"

    .line 74
    invoke-static {p2, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "includeFullResponse == null"

    .line 75
    invoke-static {p3, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "categoryRetailersLimit == null"

    .line 76
    invoke-static {p4, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    new-instance v0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Variables;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Variables;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;)V

    iput-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery;->variables:Lcom/ibotta/android/graphql/RetailerCategoryQuery$Variables;

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;
    .locals 1

    .line 106
    new-instance v0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public name()Lcom/apollographql/apollo/api/OperationName;
    .locals 1

    .line 111
    sget-object v0, Lcom/ibotta/android/graphql/RetailerCategoryQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-object v0
.end method

.method public operationId()Ljava/lang/String;
    .locals 1

    const-string v0, "46800b58736abf42ddff842c2658a6bda083010bd4cd2fc8a7ac6e2645eba407"

    return-object v0
.end method

.method public queryDocument()Ljava/lang/String;
    .locals 1

    const-string v0, "query RetailerCategory($customerId: ID!, $categoryIds: [ID]!, $includeFullResponse: Boolean = true, $categoryRetailersLimit: Int = 1000) {\n  retailerCategoryNodes(filters: {ids: {ids: $categoryIds}}) {\n    __typename\n    ...RetailerCategoryNodeFragment\n  }\n  customerNode(filters: {id: $customerId}) {\n    __typename\n    ...CustomerNodeFragment\n  }\n}\nfragment CustomerFavoriteRetailerFragment on CustomerFavoriteRetailer {\n  __typename\n  retailerId\n  favoriteDate\n  sortOrder\n  retailer {\n    __typename\n    ...RetailerNodeFragment\n  }\n}\nfragment CustomerNodeFragment on CustomerNode {\n  __typename\n  favoriteRetailers {\n    __typename\n    ...CustomerFavoriteRetailerFragment\n  }\n}\nfragment FeaturedBannerNodeFragment on FeaturedBannerNode {\n  __typename\n  id\n  name\n  link\n  categoryImg: image(type: CATEGORY) {\n    __typename\n    url\n  }\n}\nfragment FeaturedNodeFragment on FeaturedNode {\n  __typename\n  retailers {\n    __typename\n    ...RetailerNodeFragment\n  }\n  banners {\n    __typename\n    ...FeaturedBannerNodeFragment\n  }\n}\nfragment RetailerCategoryNodeFragment on RetailerCategoryNode {\n  __typename\n  id\n  name\n  iconUrl: image(type: ICON) {\n    __typename\n    url\n  }\n  retailers(limit: {limit: $categoryRetailersLimit}, filters: {primaryOrSecondaryMatch: {enabled: true}}) {\n    __typename\n    ...RetailerNodeFragment\n  }\n  features @include(if: $includeFullResponse) {\n    __typename\n    ...FeaturedNodeFragment\n  }\n}\nfragment RetailerNodeFragment on RetailerNode {\n  __typename\n  id\n  name\n  modelCImage: image(type: MODEL_C) {\n    __typename\n    url\n  }\n  nearby\n  verificationType\n}"

    return-object v0
.end method

.method public responseFieldMapper()Lcom/apollographql/apollo/api/ResponseFieldMapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
            "Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;",
            ">;"
        }
    .end annotation

    .line 102
    new-instance v0, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data$Mapper;-><init>()V

    return-object v0
.end method

.method public bridge synthetic variables()Lcom/apollographql/apollo/api/Operation$Variables;
    .locals 1

    .line 39
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/RetailerCategoryQuery;->variables()Lcom/ibotta/android/graphql/RetailerCategoryQuery$Variables;

    move-result-object v0

    return-object v0
.end method

.method public variables()Lcom/ibotta/android/graphql/RetailerCategoryQuery$Variables;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoryQuery;->variables:Lcom/ibotta/android/graphql/RetailerCategoryQuery$Variables;

    return-object v0
.end method

.method public wrapData(Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;)Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic wrapData(Lcom/apollographql/apollo/api/Operation$Data;)Ljava/lang/Object;
    .locals 0

    .line 39
    check-cast p1, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/RetailerCategoryQuery;->wrapData(Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;)Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;

    move-result-object p1

    return-object p1
.end method
