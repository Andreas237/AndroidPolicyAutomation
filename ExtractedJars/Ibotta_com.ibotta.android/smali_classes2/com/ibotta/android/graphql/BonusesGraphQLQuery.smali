.class public final Lcom/ibotta/android/graphql/BonusesGraphQLQuery;
.super Ljava/lang/Object;
.source "BonusesGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Query;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content;,
        Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;,
        Lcom/ibotta/android/graphql/BonusesGraphQLQuery$CompletedBonuse;,
        Lcom/ibotta/android/graphql/BonusesGraphQLQuery$AvailableBonuse;,
        Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;,
        Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;,
        Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/Query<",
        "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;",
        "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;",
        "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;",
        ">;"
    }
.end annotation


# static fields
.field public static final OPERATION_DEFINITION:Ljava/lang/String; = "query BonusesGraphQL($retailerId: ID, $availableLimit: Int, $completedLimit: Int, $featuredLimit: Int) {\n  availableBonuses(retailerId: $retailerId, limit: $availableLimit) {\n    __typename\n    ...BonusFragment\n  }\n  completedBonuses(limit: $completedLimit) {\n    __typename\n    ...BonusFragment\n  }\n  featuredBonusesModule {\n    __typename\n    content(limit: $featuredLimit) {\n      __typename\n      ...BonusFragment\n    }\n  }\n}"

.field public static final OPERATION_ID:Ljava/lang/String; = "d2764cbbcb6dea4306603c2497b879f72f8698d35f3b6647ce7095d3e64f454c"

.field public static final OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

.field public static final QUERY_DOCUMENT:Ljava/lang/String; = "query BonusesGraphQL($retailerId: ID, $availableLimit: Int, $completedLimit: Int, $featuredLimit: Int) {\n  availableBonuses(retailerId: $retailerId, limit: $availableLimit) {\n    __typename\n    ...BonusFragment\n  }\n  completedBonuses(limit: $completedLimit) {\n    __typename\n    ...BonusFragment\n  }\n  featuredBonusesModule {\n    __typename\n    content(limit: $featuredLimit) {\n      __typename\n      ...BonusFragment\n    }\n  }\n}\nfragment BonusFragment on Bonus {\n  __typename\n  active\n  amount\n  bonus_qualifications {\n    __typename\n    ...BonusQualificationFragment\n  }\n  bonus_type\n  cache_key\n  completed\n  completed_image_url\n  customer_started_time\n  description\n  elegible\n  expiration\n  id\n  level\n  link\n  locked\n  max_retailer_distance\n  name\n  offers\n  other_reward\n  percent_complete\n  progress_color\n  progress_count\n  quest {\n    __typename\n    ...QuestFragment\n  }\n  retailer_id\n  score\n  sort_order\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  terms\n  type\n  typed_id\n  uncompleted_image_url\n  weight\n}\nfragment BonusQualificationFragment on BonusQualification {\n  __typename\n  id\n  completed\n  progress_description\n}\nfragment QuestFragment on Quest {\n  __typename\n  image_url\n  name\n  description\n  cta\n  step\n  state\n  type\n}\nfragment SortResultFragment on SortResult {\n  __typename\n  name\n  value\n  rank\n}"


# instance fields
.field private final variables:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 63
    new-instance v0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$1;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-void
.end method

.method public constructor <init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;)V
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
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
    .param p4    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "retailerId == null"

    .line 74
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "availableLimit == null"

    .line 75
    invoke-static {p2, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "completedLimit == null"

    .line 76
    invoke-static {p3, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "featuredLimit == null"

    .line 77
    invoke-static {p4, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    new-instance v0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;-><init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;)V

    iput-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery;->variables:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;
    .locals 1

    .line 107
    new-instance v0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public name()Lcom/apollographql/apollo/api/OperationName;
    .locals 1

    .line 112
    sget-object v0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-object v0
.end method

.method public operationId()Ljava/lang/String;
    .locals 1

    const-string v0, "d2764cbbcb6dea4306603c2497b879f72f8698d35f3b6647ce7095d3e64f454c"

    return-object v0
.end method

.method public queryDocument()Ljava/lang/String;
    .locals 1

    const-string v0, "query BonusesGraphQL($retailerId: ID, $availableLimit: Int, $completedLimit: Int, $featuredLimit: Int) {\n  availableBonuses(retailerId: $retailerId, limit: $availableLimit) {\n    __typename\n    ...BonusFragment\n  }\n  completedBonuses(limit: $completedLimit) {\n    __typename\n    ...BonusFragment\n  }\n  featuredBonusesModule {\n    __typename\n    content(limit: $featuredLimit) {\n      __typename\n      ...BonusFragment\n    }\n  }\n}\nfragment BonusFragment on Bonus {\n  __typename\n  active\n  amount\n  bonus_qualifications {\n    __typename\n    ...BonusQualificationFragment\n  }\n  bonus_type\n  cache_key\n  completed\n  completed_image_url\n  customer_started_time\n  description\n  elegible\n  expiration\n  id\n  level\n  link\n  locked\n  max_retailer_distance\n  name\n  offers\n  other_reward\n  percent_complete\n  progress_color\n  progress_count\n  quest {\n    __typename\n    ...QuestFragment\n  }\n  retailer_id\n  score\n  sort_order\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  terms\n  type\n  typed_id\n  uncompleted_image_url\n  weight\n}\nfragment BonusQualificationFragment on BonusQualification {\n  __typename\n  id\n  completed\n  progress_description\n}\nfragment QuestFragment on Quest {\n  __typename\n  image_url\n  name\n  description\n  cta\n  step\n  state\n  type\n}\nfragment SortResultFragment on SortResult {\n  __typename\n  name\n  value\n  rank\n}"

    return-object v0
.end method

.method public responseFieldMapper()Lcom/apollographql/apollo/api/ResponseFieldMapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
            "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 103
    new-instance v0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data$Mapper;-><init>()V

    return-object v0
.end method

.method public bridge synthetic variables()Lcom/apollographql/apollo/api/Operation$Variables;
    .locals 1

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery;->variables()Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;

    move-result-object v0

    return-object v0
.end method

.method public variables()Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery;->variables:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;

    return-object v0
.end method

.method public wrapData(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic wrapData(Lcom/apollographql/apollo/api/Operation$Data;)Ljava/lang/Object;
    .locals 0

    .line 35
    check-cast p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery;->wrapData(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;

    move-result-object p1

    return-object p1
.end method
