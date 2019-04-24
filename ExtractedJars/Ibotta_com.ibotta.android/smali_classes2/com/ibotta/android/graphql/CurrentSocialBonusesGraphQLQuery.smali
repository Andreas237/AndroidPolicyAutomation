.class public final Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery;
.super Ljava/lang/Object;
.source "CurrentSocialBonusesGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Query;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$CurrentSocialBonuse;,
        Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;,
        Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/Query<",
        "Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;",
        "Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;",
        "Lcom/apollographql/apollo/api/Operation$Variables;",
        ">;"
    }
.end annotation


# static fields
.field public static final OPERATION_DEFINITION:Ljava/lang/String; = "query CurrentSocialBonusesGraphQL {\n  currentSocialBonuses {\n    __typename\n    ...BonusFragment\n  }\n}"

.field public static final OPERATION_ID:Ljava/lang/String; = "83dabef46aa38ee114e60e1007557ef6707ef31c0a5b0e7d93db5b43e1d2da98"

.field public static final OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

.field public static final QUERY_DOCUMENT:Ljava/lang/String; = "query CurrentSocialBonusesGraphQL {\n  currentSocialBonuses {\n    __typename\n    ...BonusFragment\n  }\n}\nfragment BonusFragment on Bonus {\n  __typename\n  active\n  amount\n  bonus_qualifications {\n    __typename\n    ...BonusQualificationFragment\n  }\n  bonus_type\n  cache_key\n  completed\n  completed_image_url\n  customer_started_time\n  description\n  elegible\n  expiration\n  id\n  level\n  link\n  locked\n  max_retailer_distance\n  name\n  offers\n  other_reward\n  percent_complete\n  progress_color\n  progress_count\n  quest {\n    __typename\n    ...QuestFragment\n  }\n  retailer_id\n  score\n  sort_order\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  terms\n  type\n  typed_id\n  uncompleted_image_url\n  weight\n}\nfragment BonusQualificationFragment on BonusQualification {\n  __typename\n  id\n  completed\n  progress_description\n}\nfragment QuestFragment on Quest {\n  __typename\n  image_url\n  name\n  description\n  cta\n  step\n  state\n  type\n}\nfragment SortResultFragment on SortResult {\n  __typename\n  name\n  value\n  rank\n}"


# instance fields
.field private final variables:Lcom/apollographql/apollo/api/Operation$Variables;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    new-instance v0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$1;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    sget-object v0, Lcom/apollographql/apollo/api/Operation;->EMPTY_VARIABLES:Lcom/apollographql/apollo/api/Operation$Variables;

    iput-object v0, p0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery;->variables:Lcom/apollographql/apollo/api/Operation$Variables;

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Builder;
    .locals 1

    .line 84
    new-instance v0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public name()Lcom/apollographql/apollo/api/OperationName;
    .locals 1

    .line 89
    sget-object v0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-object v0
.end method

.method public operationId()Ljava/lang/String;
    .locals 1

    const-string v0, "83dabef46aa38ee114e60e1007557ef6707ef31c0a5b0e7d93db5b43e1d2da98"

    return-object v0
.end method

.method public queryDocument()Ljava/lang/String;
    .locals 1

    const-string v0, "query CurrentSocialBonusesGraphQL {\n  currentSocialBonuses {\n    __typename\n    ...BonusFragment\n  }\n}\nfragment BonusFragment on Bonus {\n  __typename\n  active\n  amount\n  bonus_qualifications {\n    __typename\n    ...BonusQualificationFragment\n  }\n  bonus_type\n  cache_key\n  completed\n  completed_image_url\n  customer_started_time\n  description\n  elegible\n  expiration\n  id\n  level\n  link\n  locked\n  max_retailer_distance\n  name\n  offers\n  other_reward\n  percent_complete\n  progress_color\n  progress_count\n  quest {\n    __typename\n    ...QuestFragment\n  }\n  retailer_id\n  score\n  sort_order\n  sort_results {\n    __typename\n    ...SortResultFragment\n  }\n  terms\n  type\n  typed_id\n  uncompleted_image_url\n  weight\n}\nfragment BonusQualificationFragment on BonusQualification {\n  __typename\n  id\n  completed\n  progress_description\n}\nfragment QuestFragment on Quest {\n  __typename\n  image_url\n  name\n  description\n  cta\n  step\n  state\n  type\n}\nfragment SortResultFragment on SortResult {\n  __typename\n  name\n  value\n  rank\n}"

    return-object v0
.end method

.method public responseFieldMapper()Lcom/apollographql/apollo/api/ResponseFieldMapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
            "Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 80
    new-instance v0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data$Mapper;-><init>()V

    return-object v0
.end method

.method public variables()Lcom/apollographql/apollo/api/Operation$Variables;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery;->variables:Lcom/apollographql/apollo/api/Operation$Variables;

    return-object v0
.end method

.method public wrapData(Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;)Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic wrapData(Lcom/apollographql/apollo/api/Operation$Data;)Ljava/lang/Object;
    .locals 0

    .line 27
    check-cast p1, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery;->wrapData(Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;)Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;

    move-result-object p1

    return-object p1
.end method
