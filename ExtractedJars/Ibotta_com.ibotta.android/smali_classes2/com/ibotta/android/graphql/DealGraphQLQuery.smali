.class public final Lcom/ibotta/android/graphql/DealGraphQLQuery;
.super Ljava/lang/Object;
.source "DealGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Query;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/DealGraphQLQuery$Deal;,
        Lcom/ibotta/android/graphql/DealGraphQLQuery$Data;,
        Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;,
        Lcom/ibotta/android/graphql/DealGraphQLQuery$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/Query<",
        "Lcom/ibotta/android/graphql/DealGraphQLQuery$Data;",
        "Lcom/ibotta/android/graphql/DealGraphQLQuery$Data;",
        "Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;",
        ">;"
    }
.end annotation


# static fields
.field public static final OPERATION_DEFINITION:Ljava/lang/String; = "query DealGraphQL($id: ID!) {\n  deal(id: $id) {\n    __typename\n    ...DealFragment\n  }\n}"

.field public static final OPERATION_ID:Ljava/lang/String; = "fe6c12c6be0221b98a9390afb5fc9eaa745fa3b09ccc00a9515d3d683910d7d0"

.field public static final OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

.field public static final QUERY_DOCUMENT:Ljava/lang/String; = "query DealGraphQL($id: ID!) {\n  deal(id: $id) {\n    __typename\n    ...DealFragment\n  }\n}\nfragment DealFragment on Deal {\n  __typename\n  action_button_text\n  action_button_type\n  button_info\n  cache_key\n  callback_url\n  deeplink_url\n  description\n  end_time\n  id\n  image_url_large\n  image_url_small\n  image_url_thumbnail\n  link\n  name\n  percent_back_text\n  price\n  start_time\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  retailer_id\n  type\n  typed_id\n}\nfragment SortResultFragment on SortResult {\n  __typename\n  name\n  value\n  rank\n}"


# instance fields
.field private final variables:Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    new-instance v0, Lcom/ibotta/android/graphql/DealGraphQLQuery$1;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/DealGraphQLQuery$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/graphql/DealGraphQLQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "id == null"

    .line 55
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    new-instance v0, Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;

    invoke-direct {v0, p1}, Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ibotta/android/graphql/DealGraphQLQuery;->variables:Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/DealGraphQLQuery$Builder;
    .locals 1

    .line 85
    new-instance v0, Lcom/ibotta/android/graphql/DealGraphQLQuery$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/DealGraphQLQuery$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public name()Lcom/apollographql/apollo/api/OperationName;
    .locals 1

    .line 90
    sget-object v0, Lcom/ibotta/android/graphql/DealGraphQLQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-object v0
.end method

.method public operationId()Ljava/lang/String;
    .locals 1

    const-string v0, "fe6c12c6be0221b98a9390afb5fc9eaa745fa3b09ccc00a9515d3d683910d7d0"

    return-object v0
.end method

.method public queryDocument()Ljava/lang/String;
    .locals 1

    const-string v0, "query DealGraphQL($id: ID!) {\n  deal(id: $id) {\n    __typename\n    ...DealFragment\n  }\n}\nfragment DealFragment on Deal {\n  __typename\n  action_button_text\n  action_button_type\n  button_info\n  cache_key\n  callback_url\n  deeplink_url\n  description\n  end_time\n  id\n  image_url_large\n  image_url_small\n  image_url_thumbnail\n  link\n  name\n  percent_back_text\n  price\n  start_time\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  sort_order\n  retailer_id\n  type\n  typed_id\n}\nfragment SortResultFragment on SortResult {\n  __typename\n  name\n  value\n  rank\n}"

    return-object v0
.end method

.method public responseFieldMapper()Lcom/apollographql/apollo/api/ResponseFieldMapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
            "Lcom/ibotta/android/graphql/DealGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 81
    new-instance v0, Lcom/ibotta/android/graphql/DealGraphQLQuery$Data$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/DealGraphQLQuery$Data$Mapper;-><init>()V

    return-object v0
.end method

.method public bridge synthetic variables()Lcom/apollographql/apollo/api/Operation$Variables;
    .locals 1

    .line 30
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/DealGraphQLQuery;->variables()Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;

    move-result-object v0

    return-object v0
.end method

.method public variables()Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/graphql/DealGraphQLQuery;->variables:Lcom/ibotta/android/graphql/DealGraphQLQuery$Variables;

    return-object v0
.end method

.method public wrapData(Lcom/ibotta/android/graphql/DealGraphQLQuery$Data;)Lcom/ibotta/android/graphql/DealGraphQLQuery$Data;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic wrapData(Lcom/apollographql/apollo/api/Operation$Data;)Ljava/lang/Object;
    .locals 0

    .line 30
    check-cast p1, Lcom/ibotta/android/graphql/DealGraphQLQuery$Data;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/DealGraphQLQuery;->wrapData(Lcom/ibotta/android/graphql/DealGraphQLQuery$Data;)Lcom/ibotta/android/graphql/DealGraphQLQuery$Data;

    move-result-object p1

    return-object p1
.end method
