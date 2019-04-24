.class public final Lcom/ibotta/android/graphql/BonusGraphQLQuery;
.super Ljava/lang/Object;
.source "BonusGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Query;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/BonusGraphQLQuery$Bonus;,
        Lcom/ibotta/android/graphql/BonusGraphQLQuery$Data;,
        Lcom/ibotta/android/graphql/BonusGraphQLQuery$Variables;,
        Lcom/ibotta/android/graphql/BonusGraphQLQuery$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/Query<",
        "Lcom/ibotta/android/graphql/BonusGraphQLQuery$Data;",
        "Lcom/ibotta/android/graphql/BonusGraphQLQuery$Data;",
        "Lcom/ibotta/android/graphql/BonusGraphQLQuery$Variables;",
        ">;"
    }
.end annotation


# static fields
.field public static final OPERATION_DEFINITION:Ljava/lang/String; = "query BonusGraphQL($id: ID!) {\n  bonus(id: $id) {\n    __typename\n    ...BonusFragment\n  }\n}"

.field public static final OPERATION_ID:Ljava/lang/String; = "1fcb55e8d70b4af86b36b606da438a8dd90350979a1d844baa35debc5722db72"

.field public static final OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

.field public static final QUERY_DOCUMENT:Ljava/lang/String; = "query BonusGraphQL($id: ID!) {\n  bonus(id: $id) {\n    __typename\n    ...BonusFragment\n  }\n}\nfragment BonusFragment on Bonus {\n  __typename\n  active\n  amount\n  bonus_qualifications {\n    __typename\n    ...BonusQualificationFragment\n  }\n  bonus_type\n  cache_key\n  completed\n  completed_image_url\n  customer_started_time\n  description\n  elegible\n  expiration\n  id\n  level\n  link\n  locked\n  max_retailer_distance\n  name\n  offers\n  other_reward\n  percent_complete\n  progress_color\n  progress_count\n  quest {\n    __typename\n    ...QuestFragment\n  }\n  retailer_id\n  score\n  sort_order\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  terms\n  type\n  typed_id\n  uncompleted_image_url\n  weight\n}\nfragment BonusQualificationFragment on BonusQualification {\n  __typename\n  id\n  completed\n  progress_description\n}\nfragment QuestFragment on Quest {\n  __typename\n  image_url\n  name\n  description\n  cta\n  step\n  state\n  type\n}\nfragment SortResultFragment on SortResult {\n  __typename\n  name\n  value\n  rank\n}"


# instance fields
.field private final variables:Lcom/ibotta/android/graphql/BonusGraphQLQuery$Variables;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 49
    new-instance v0, Lcom/ibotta/android/graphql/BonusGraphQLQuery$1;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/BonusGraphQLQuery$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/graphql/BonusGraphQLQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "id == null"

    .line 59
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    new-instance v0, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Variables;

    invoke-direct {v0, p1}, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Variables;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ibotta/android/graphql/BonusGraphQLQuery;->variables:Lcom/ibotta/android/graphql/BonusGraphQLQuery$Variables;

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/BonusGraphQLQuery$Builder;
    .locals 1

    .line 89
    new-instance v0, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public name()Lcom/apollographql/apollo/api/OperationName;
    .locals 1

    .line 94
    sget-object v0, Lcom/ibotta/android/graphql/BonusGraphQLQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-object v0
.end method

.method public operationId()Ljava/lang/String;
    .locals 1

    const-string v0, "1fcb55e8d70b4af86b36b606da438a8dd90350979a1d844baa35debc5722db72"

    return-object v0
.end method

.method public queryDocument()Ljava/lang/String;
    .locals 1

    const-string v0, "query BonusGraphQL($id: ID!) {\n  bonus(id: $id) {\n    __typename\n    ...BonusFragment\n  }\n}\nfragment BonusFragment on Bonus {\n  __typename\n  active\n  amount\n  bonus_qualifications {\n    __typename\n    ...BonusQualificationFragment\n  }\n  bonus_type\n  cache_key\n  completed\n  completed_image_url\n  customer_started_time\n  description\n  elegible\n  expiration\n  id\n  level\n  link\n  locked\n  max_retailer_distance\n  name\n  offers\n  other_reward\n  percent_complete\n  progress_color\n  progress_count\n  quest {\n    __typename\n    ...QuestFragment\n  }\n  retailer_id\n  score\n  sort_order\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  terms\n  type\n  typed_id\n  uncompleted_image_url\n  weight\n}\nfragment BonusQualificationFragment on BonusQualification {\n  __typename\n  id\n  completed\n  progress_description\n}\nfragment QuestFragment on Quest {\n  __typename\n  image_url\n  name\n  description\n  cta\n  step\n  state\n  type\n}\nfragment SortResultFragment on SortResult {\n  __typename\n  name\n  value\n  rank\n}"

    return-object v0
.end method

.method public responseFieldMapper()Lcom/apollographql/apollo/api/ResponseFieldMapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
            "Lcom/ibotta/android/graphql/BonusGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 85
    new-instance v0, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Data$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Data$Mapper;-><init>()V

    return-object v0
.end method

.method public bridge synthetic variables()Lcom/apollographql/apollo/api/Operation$Variables;
    .locals 1

    .line 32
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/BonusGraphQLQuery;->variables()Lcom/ibotta/android/graphql/BonusGraphQLQuery$Variables;

    move-result-object v0

    return-object v0
.end method

.method public variables()Lcom/ibotta/android/graphql/BonusGraphQLQuery$Variables;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusGraphQLQuery;->variables:Lcom/ibotta/android/graphql/BonusGraphQLQuery$Variables;

    return-object v0
.end method

.method public wrapData(Lcom/ibotta/android/graphql/BonusGraphQLQuery$Data;)Lcom/ibotta/android/graphql/BonusGraphQLQuery$Data;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic wrapData(Lcom/apollographql/apollo/api/Operation$Data;)Ljava/lang/Object;
    .locals 0

    .line 32
    check-cast p1, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Data;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/BonusGraphQLQuery;->wrapData(Lcom/ibotta/android/graphql/BonusGraphQLQuery$Data;)Lcom/ibotta/android/graphql/BonusGraphQLQuery$Data;

    move-result-object p1

    return-object p1
.end method
