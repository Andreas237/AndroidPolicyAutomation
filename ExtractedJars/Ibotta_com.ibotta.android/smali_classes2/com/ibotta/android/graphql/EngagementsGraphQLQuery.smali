.class public final Lcom/ibotta/android/graphql/EngagementsGraphQLQuery;
.super Ljava/lang/Object;
.source "EngagementsGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Query;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement;,
        Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Data;,
        Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;,
        Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/Query<",
        "Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Data;",
        "Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Data;",
        "Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;",
        ">;"
    }
.end annotation


# static fields
.field public static final OPERATION_DEFINITION:Ljava/lang/String; = "query EngagementsGraphQL($rewardIds: [Int]) {\n  engagements(rewardIds: $rewardIds) {\n    __typename\n    ...EngagementFragment\n  }\n}"

.field public static final OPERATION_ID:Ljava/lang/String; = "bc1ed578eb5bf50eedf88cc9eda13daa4867d41db1dddb89cece2d55199831d6"

.field public static final OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

.field public static final QUERY_DOCUMENT:Ljava/lang/String; = "query EngagementsGraphQL($rewardIds: [Int]) {\n  engagements(rewardIds: $rewardIds) {\n    __typename\n    ...EngagementFragment\n  }\n}\nfragment EngagementFragment on Engagement {\n  __typename\n  answer\n  content\n  id\n  legal\n  linked_offer_ids\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  questions {\n    __typename\n    ...OfferRewardQuestionFragment\n  }\n  reward_id\n  thumb\n  tracking_click_url\n  tracking_impression_url\n  type\n  url\n}\nfragment OfferRewardPollOptFragment on OfferRewardPollOpt {\n  __typename\n  id\n  content\n  clear_options\n  next_survey_question\n  url\n}\nfragment OfferRewardQuestionFragment on OfferRewardQuestion {\n  __typename\n  id\n  answer\n  content\n  multiple_response\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  url\n}"


# instance fields
.field private final variables:Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 50
    new-instance v0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$1;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-void
.end method

.method public constructor <init>(Lcom/apollographql/apollo/api/Input;)V
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;)V"
        }
    .end annotation

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rewardIds == null"

    .line 60
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    new-instance v0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;

    invoke-direct {v0, p1}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;-><init>(Lcom/apollographql/apollo/api/Input;)V

    iput-object v0, p0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery;->variables:Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Builder;
    .locals 1

    .line 90
    new-instance v0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public name()Lcom/apollographql/apollo/api/OperationName;
    .locals 1

    .line 95
    sget-object v0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-object v0
.end method

.method public operationId()Ljava/lang/String;
    .locals 1

    const-string v0, "bc1ed578eb5bf50eedf88cc9eda13daa4867d41db1dddb89cece2d55199831d6"

    return-object v0
.end method

.method public queryDocument()Ljava/lang/String;
    .locals 1

    const-string v0, "query EngagementsGraphQL($rewardIds: [Int]) {\n  engagements(rewardIds: $rewardIds) {\n    __typename\n    ...EngagementFragment\n  }\n}\nfragment EngagementFragment on Engagement {\n  __typename\n  answer\n  content\n  id\n  legal\n  linked_offer_ids\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  questions {\n    __typename\n    ...OfferRewardQuestionFragment\n  }\n  reward_id\n  thumb\n  tracking_click_url\n  tracking_impression_url\n  type\n  url\n}\nfragment OfferRewardPollOptFragment on OfferRewardPollOpt {\n  __typename\n  id\n  content\n  clear_options\n  next_survey_question\n  url\n}\nfragment OfferRewardQuestionFragment on OfferRewardQuestion {\n  __typename\n  id\n  answer\n  content\n  multiple_response\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  url\n}"

    return-object v0
.end method

.method public responseFieldMapper()Lcom/apollographql/apollo/api/ResponseFieldMapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
            "Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 86
    new-instance v0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Data$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Data$Mapper;-><init>()V

    return-object v0
.end method

.method public bridge synthetic variables()Lcom/apollographql/apollo/api/Operation$Variables;
    .locals 1

    .line 34
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery;->variables()Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;

    move-result-object v0

    return-object v0
.end method

.method public variables()Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery;->variables:Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;

    return-object v0
.end method

.method public wrapData(Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Data;)Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Data;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic wrapData(Lcom/apollographql/apollo/api/Operation$Data;)Ljava/lang/Object;
    .locals 0

    .line 34
    check-cast p1, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Data;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery;->wrapData(Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Data;)Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Data;

    move-result-object p1

    return-object p1
.end method
