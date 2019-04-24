.class public final Lcom/ibotta/android/graphql/ProductGraphQLQuery;
.super Ljava/lang/Object;
.source "ProductGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Query;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product;,
        Lcom/ibotta/android/graphql/ProductGraphQLQuery$Data;,
        Lcom/ibotta/android/graphql/ProductGraphQLQuery$Variables;,
        Lcom/ibotta/android/graphql/ProductGraphQLQuery$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/Query<",
        "Lcom/ibotta/android/graphql/ProductGraphQLQuery$Data;",
        "Lcom/ibotta/android/graphql/ProductGraphQLQuery$Data;",
        "Lcom/ibotta/android/graphql/ProductGraphQLQuery$Variables;",
        ">;"
    }
.end annotation


# static fields
.field public static final OPERATION_DEFINITION:Ljava/lang/String; = "query ProductGraphQL($productId: ID!) {\n  product(id: $productId) {\n    __typename\n    ...ProductFragment\n  }\n}"

.field public static final OPERATION_ID:Ljava/lang/String; = "a402b59bc1bfab6bda7f3ab456c63c05faf9ef667285e1366d3fdafd3eacb585"

.field public static final OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

.field public static final QUERY_DOCUMENT:Ljava/lang/String; = "query ProductGraphQL($productId: ID!) {\n  product(id: $productId) {\n    __typename\n    ...ProductFragment\n  }\n}\nfragment ProductFragment on Product {\n  __typename\n  action_button_text\n  action_button_type\n  cache_key\n  current_value\n  deeplink_url\n  description\n  id\n  image_url_large\n  image_url_small\n  image_url_thumbnail\n  link\n  name\n  price\n  retailer_id\n  sort_order\n  type\n  typed_id\n}"


# instance fields
.field private final variables:Lcom/ibotta/android/graphql/ProductGraphQLQuery$Variables;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 43
    new-instance v0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$1;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/ProductGraphQLQuery$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/graphql/ProductGraphQLQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "productId == null"

    .line 53
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    new-instance v0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Variables;

    invoke-direct {v0, p1}, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Variables;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ibotta/android/graphql/ProductGraphQLQuery;->variables:Lcom/ibotta/android/graphql/ProductGraphQLQuery$Variables;

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/ProductGraphQLQuery$Builder;
    .locals 1

    .line 83
    new-instance v0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public name()Lcom/apollographql/apollo/api/OperationName;
    .locals 1

    .line 88
    sget-object v0, Lcom/ibotta/android/graphql/ProductGraphQLQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-object v0
.end method

.method public operationId()Ljava/lang/String;
    .locals 1

    const-string v0, "a402b59bc1bfab6bda7f3ab456c63c05faf9ef667285e1366d3fdafd3eacb585"

    return-object v0
.end method

.method public queryDocument()Ljava/lang/String;
    .locals 1

    const-string v0, "query ProductGraphQL($productId: ID!) {\n  product(id: $productId) {\n    __typename\n    ...ProductFragment\n  }\n}\nfragment ProductFragment on Product {\n  __typename\n  action_button_text\n  action_button_type\n  cache_key\n  current_value\n  deeplink_url\n  description\n  id\n  image_url_large\n  image_url_small\n  image_url_thumbnail\n  link\n  name\n  price\n  retailer_id\n  sort_order\n  type\n  typed_id\n}"

    return-object v0
.end method

.method public responseFieldMapper()Lcom/apollographql/apollo/api/ResponseFieldMapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
            "Lcom/ibotta/android/graphql/ProductGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 79
    new-instance v0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Data$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Data$Mapper;-><init>()V

    return-object v0
.end method

.method public bridge synthetic variables()Lcom/apollographql/apollo/api/Operation$Variables;
    .locals 1

    .line 29
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/ProductGraphQLQuery;->variables()Lcom/ibotta/android/graphql/ProductGraphQLQuery$Variables;

    move-result-object v0

    return-object v0
.end method

.method public variables()Lcom/ibotta/android/graphql/ProductGraphQLQuery$Variables;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/graphql/ProductGraphQLQuery;->variables:Lcom/ibotta/android/graphql/ProductGraphQLQuery$Variables;

    return-object v0
.end method

.method public wrapData(Lcom/ibotta/android/graphql/ProductGraphQLQuery$Data;)Lcom/ibotta/android/graphql/ProductGraphQLQuery$Data;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic wrapData(Lcom/apollographql/apollo/api/Operation$Data;)Ljava/lang/Object;
    .locals 0

    .line 29
    check-cast p1, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Data;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/ProductGraphQLQuery;->wrapData(Lcom/ibotta/android/graphql/ProductGraphQLQuery$Data;)Lcom/ibotta/android/graphql/ProductGraphQLQuery$Data;

    move-result-object p1

    return-object p1
.end method
