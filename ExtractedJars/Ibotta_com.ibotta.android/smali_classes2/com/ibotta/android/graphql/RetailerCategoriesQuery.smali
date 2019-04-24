.class public final Lcom/ibotta/android/graphql/RetailerCategoriesQuery;
.super Ljava/lang/Object;
.source "RetailerCategoriesQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Query;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;,
        Lcom/ibotta/android/graphql/RetailerCategoriesQuery$RetailerCategoryNode;,
        Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;,
        Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;,
        Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/Query<",
        "Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;",
        "Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;",
        "Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;",
        ">;"
    }
.end annotation


# static fields
.field public static final OPERATION_DEFINITION:Ljava/lang/String; = "query RetailerCategories($customerId: ID!, $includeFullResponse: Boolean = false, $categoryRetailersLimit: Int = 1) {\n  retailerCategoryNodes(limit: {limit: 1000}, filters: {categoryType: {type: NORMAL}}) {\n    __typename\n    ...RetailerCategoryNodeFragment\n  }\n  customerNode(filters: {id: $customerId}) {\n    __typename\n    ...CustomerNodeFragment\n  }\n}"

.field public static final OPERATION_ID:Ljava/lang/String; = "44b6941038bdd4af000ccce3d39a7d066728fbf48d132920e1c4e39a4e18a05d"

.field public static final OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

.field public static final QUERY_DOCUMENT:Ljava/lang/String; = "query RetailerCategories($customerId: ID!, $includeFullResponse: Boolean = false, $categoryRetailersLimit: Int = 1) {\n  retailerCategoryNodes(limit: {limit: 1000}, filters: {categoryType: {type: NORMAL}}) {\n    __typename\n    ...RetailerCategoryNodeFragment\n  }\n  customerNode(filters: {id: $customerId}) {\n    __typename\n    ...CustomerNodeFragment\n  }\n}\nfragment CustomerFavoriteRetailerFragment on CustomerFavoriteRetailer {\n  __typename\n  retailerId\n  favoriteDate\n  sortOrder\n  retailer {\n    __typename\n    ...RetailerNodeFragment\n  }\n}\nfragment CustomerNodeFragment on CustomerNode {\n  __typename\n  favoriteRetailers {\n    __typename\n    ...CustomerFavoriteRetailerFragment\n  }\n}\nfragment FeaturedBannerNodeFragment on FeaturedBannerNode {\n  __typename\n  id\n  name\n  link\n  categoryImg: image(type: CATEGORY) {\n    __typename\n    url\n  }\n}\nfragment FeaturedNodeFragment on FeaturedNode {\n  __typename\n  retailers {\n    __typename\n    ...RetailerNodeFragment\n  }\n  banners {\n    __typename\n    ...FeaturedBannerNodeFragment\n  }\n}\nfragment RetailerCategoryNodeFragment on RetailerCategoryNode {\n  __typename\n  id\n  name\n  iconUrl: image(type: ICON) {\n    __typename\n    url\n  }\n  retailers(limit: {limit: $categoryRetailersLimit}, filters: {primaryOrSecondaryMatch: {enabled: true}}) {\n    __typename\n    ...RetailerNodeFragment\n  }\n  features @include(if: $includeFullResponse) {\n    __typename\n    ...FeaturedNodeFragment\n  }\n}\nfragment RetailerNodeFragment on RetailerNode {\n  __typename\n  id\n  name\n  modelCImage: image(type: MODEL_C) {\n    __typename\n    url\n  }\n  nearby\n  verificationType\n}"


# instance fields
.field private final variables:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 61
    new-instance v0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$1;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p3    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "customerId == null"

    .line 72
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "includeFullResponse == null"

    .line 73
    invoke-static {p2, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "categoryRetailersLimit == null"

    .line 74
    invoke-static {p3, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    new-instance v0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;-><init>(Ljava/lang/String;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;)V

    iput-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery;->variables:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Builder;
    .locals 1

    .line 104
    new-instance v0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public name()Lcom/apollographql/apollo/api/OperationName;
    .locals 1

    .line 109
    sget-object v0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-object v0
.end method

.method public operationId()Ljava/lang/String;
    .locals 1

    const-string v0, "44b6941038bdd4af000ccce3d39a7d066728fbf48d132920e1c4e39a4e18a05d"

    return-object v0
.end method

.method public queryDocument()Ljava/lang/String;
    .locals 1

    const-string v0, "query RetailerCategories($customerId: ID!, $includeFullResponse: Boolean = false, $categoryRetailersLimit: Int = 1) {\n  retailerCategoryNodes(limit: {limit: 1000}, filters: {categoryType: {type: NORMAL}}) {\n    __typename\n    ...RetailerCategoryNodeFragment\n  }\n  customerNode(filters: {id: $customerId}) {\n    __typename\n    ...CustomerNodeFragment\n  }\n}\nfragment CustomerFavoriteRetailerFragment on CustomerFavoriteRetailer {\n  __typename\n  retailerId\n  favoriteDate\n  sortOrder\n  retailer {\n    __typename\n    ...RetailerNodeFragment\n  }\n}\nfragment CustomerNodeFragment on CustomerNode {\n  __typename\n  favoriteRetailers {\n    __typename\n    ...CustomerFavoriteRetailerFragment\n  }\n}\nfragment FeaturedBannerNodeFragment on FeaturedBannerNode {\n  __typename\n  id\n  name\n  link\n  categoryImg: image(type: CATEGORY) {\n    __typename\n    url\n  }\n}\nfragment FeaturedNodeFragment on FeaturedNode {\n  __typename\n  retailers {\n    __typename\n    ...RetailerNodeFragment\n  }\n  banners {\n    __typename\n    ...FeaturedBannerNodeFragment\n  }\n}\nfragment RetailerCategoryNodeFragment on RetailerCategoryNode {\n  __typename\n  id\n  name\n  iconUrl: image(type: ICON) {\n    __typename\n    url\n  }\n  retailers(limit: {limit: $categoryRetailersLimit}, filters: {primaryOrSecondaryMatch: {enabled: true}}) {\n    __typename\n    ...RetailerNodeFragment\n  }\n  features @include(if: $includeFullResponse) {\n    __typename\n    ...FeaturedNodeFragment\n  }\n}\nfragment RetailerNodeFragment on RetailerNode {\n  __typename\n  id\n  name\n  modelCImage: image(type: MODEL_C) {\n    __typename\n    url\n  }\n  nearby\n  verificationType\n}"

    return-object v0
.end method

.method public responseFieldMapper()Lcom/apollographql/apollo/api/ResponseFieldMapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
            "Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;",
            ">;"
        }
    .end annotation

    .line 100
    new-instance v0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data$Mapper;-><init>()V

    return-object v0
.end method

.method public bridge synthetic variables()Lcom/apollographql/apollo/api/Operation$Variables;
    .locals 1

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery;->variables()Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;

    move-result-object v0

    return-object v0
.end method

.method public variables()Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery;->variables:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;

    return-object v0
.end method

.method public wrapData(Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;)Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic wrapData(Lcom/apollographql/apollo/api/Operation$Data;)Ljava/lang/Object;
    .locals 0

    .line 38
    check-cast p1, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery;->wrapData(Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;)Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;

    move-result-object p1

    return-object p1
.end method
