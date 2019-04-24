.class public Lcom/ibotta/android/graphql/fragment/RewardFragment;
.super Ljava/lang/Object;
.source "RewardFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/GraphqlFragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/RewardFragment$Question;,
        Lcom/ibotta/android/graphql/fragment/RewardFragment$Option;,
        Lcom/ibotta/android/graphql/fragment/RewardFragment$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;

.field public static final FRAGMENT_DEFINITION:Ljava/lang/String; = "fragment RewardFragment on OfferReward {\n  __typename\n  amount\n  answer\n  content\n  engagement_id\n  id\n  legal\n  linked_offer_ids\n  options {\n    __typename\n    ...OfferRewardPollOptFragment\n  }\n  questions {\n    __typename\n    ...OfferRewardQuestionFragment\n  }\n  thumb\n  tracking_click_url\n  tracking_impression_url\n  type\n  url\n  weight\n}"

.field public static final POSSIBLE_TYPES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final __typename:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final amount:Ljava/lang/Double;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final answer:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final content:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final engagement_id:Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final id:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final legal:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final linked_offer_ids:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final options:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/RewardFragment$Option;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final questions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/RewardFragment$Question;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final thumb:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final tracking_click_url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final tracking_impression_url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final type:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final weight:Ljava/lang/Double;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v0, 0x10

    .line 26
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 27
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "amount"

    const-string v2, "amount"

    .line 28
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forDouble(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "answer"

    const-string v2, "answer"

    .line 29
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "content"

    const-string v2, "content"

    .line 30
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "engagement_id"

    const-string v2, "engagement_id"

    .line 31
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v6, "id"

    const-string v7, "id"

    sget-object v10, Lcom/ibotta/android/graphql/type/CustomType;->ID:Lcom/ibotta/android/graphql/type/CustomType;

    .line 32
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v11

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/apollographql/apollo/api/ResponseField;->forCustomType(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLcom/apollographql/apollo/api/ScalarType;Ljava/util/List;)Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "legal"

    const-string v2, "legal"

    .line 33
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "linked_offer_ids"

    const-string v2, "linked_offer_ids"

    .line 34
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "options"

    const-string v2, "options"

    .line 35
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "questions"

    const-string v2, "questions"

    .line 36
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "thumb"

    const-string v2, "thumb"

    .line 37
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "tracking_click_url"

    const-string v2, "tracking_click_url"

    .line 38
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "tracking_impression_url"

    const-string v2, "tracking_impression_url"

    .line 39
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "type"

    const-string v2, "type"

    .line 40
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "url"

    const-string v2, "url"

    .line 41
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "weight"

    const-string v2, "weight"

    .line 42
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forDouble(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const-string v0, "OfferReward"

    .line 70
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->POSSIBLE_TYPES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Double;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p13    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p14    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p15    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p16    # Ljava/lang/Double;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/RewardFragment$Option;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/RewardFragment$Question;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "__typename == null"

    move-object v2, p1

    .line 116
    invoke-static {p1, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->__typename:Ljava/lang/String;

    move-object v1, p2

    .line 117
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->amount:Ljava/lang/Double;

    move-object v1, p3

    .line 118
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->answer:Ljava/lang/String;

    move-object v1, p4

    .line 119
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->content:Ljava/lang/String;

    move-object v1, p5

    .line 120
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->engagement_id:Ljava/lang/Long;

    const-string v1, "id == null"

    move-object v2, p6

    .line 121
    invoke-static {p6, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->id:Ljava/lang/String;

    move-object v1, p7

    .line 122
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->legal:Ljava/lang/String;

    move-object v1, p8

    .line 123
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->linked_offer_ids:Ljava/util/List;

    move-object v1, p9

    .line 124
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->options:Ljava/util/List;

    move-object v1, p10

    .line 125
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->questions:Ljava/util/List;

    move-object v1, p11

    .line 126
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->thumb:Ljava/lang/String;

    move-object v1, p12

    .line 127
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->tracking_click_url:Ljava/lang/String;

    move-object/from16 v1, p13

    .line 128
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->tracking_impression_url:Ljava/lang/String;

    move-object/from16 v1, p14

    .line 129
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->type:Ljava/lang/String;

    move-object/from16 v1, p15

    .line 130
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->url:Ljava/lang/String;

    move-object/from16 v1, p16

    .line 131
    iput-object v1, v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->weight:Ljava/lang/Double;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public amount()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->amount:Ljava/lang/Double;

    return-object v0
.end method

.method public answer()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->answer:Ljava/lang/String;

    return-object v0
.end method

.method public content()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->content:Ljava/lang/String;

    return-object v0
.end method

.method public engagement_id()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->engagement_id:Ljava/lang/Long;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 267
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;

    const/4 v2, 0x0

    if-eqz v1, :cond_10

    .line 268
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;

    .line 269
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->amount:Ljava/lang/Double;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->amount:Ljava/lang/Double;

    if-nez v1, :cond_f

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->amount:Ljava/lang/Double;

    .line 270
    invoke-virtual {v1, v3}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->answer:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->answer:Ljava/lang/String;

    if-nez v1, :cond_f

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->answer:Ljava/lang/String;

    .line 271
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->content:Ljava/lang/String;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->content:Ljava/lang/String;

    if-nez v1, :cond_f

    goto :goto_2

    :cond_3
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->content:Ljava/lang/String;

    .line 272
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->engagement_id:Ljava/lang/Long;

    if-nez v1, :cond_4

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->engagement_id:Ljava/lang/Long;

    if-nez v1, :cond_f

    goto :goto_3

    :cond_4
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->engagement_id:Ljava/lang/Long;

    .line 273
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    :goto_3
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->id:Ljava/lang/String;

    .line 274
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->legal:Ljava/lang/String;

    if-nez v1, :cond_5

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->legal:Ljava/lang/String;

    if-nez v1, :cond_f

    goto :goto_4

    :cond_5
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->legal:Ljava/lang/String;

    .line 275
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    :goto_4
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->linked_offer_ids:Ljava/util/List;

    if-nez v1, :cond_6

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->linked_offer_ids:Ljava/util/List;

    if-nez v1, :cond_f

    goto :goto_5

    :cond_6
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->linked_offer_ids:Ljava/util/List;

    .line 276
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    :goto_5
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->options:Ljava/util/List;

    if-nez v1, :cond_7

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->options:Ljava/util/List;

    if-nez v1, :cond_f

    goto :goto_6

    :cond_7
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->options:Ljava/util/List;

    .line 277
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    :goto_6
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->questions:Ljava/util/List;

    if-nez v1, :cond_8

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->questions:Ljava/util/List;

    if-nez v1, :cond_f

    goto :goto_7

    :cond_8
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->questions:Ljava/util/List;

    .line 278
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    :goto_7
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->thumb:Ljava/lang/String;

    if-nez v1, :cond_9

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->thumb:Ljava/lang/String;

    if-nez v1, :cond_f

    goto :goto_8

    :cond_9
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->thumb:Ljava/lang/String;

    .line 279
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    :goto_8
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->tracking_click_url:Ljava/lang/String;

    if-nez v1, :cond_a

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->tracking_click_url:Ljava/lang/String;

    if-nez v1, :cond_f

    goto :goto_9

    :cond_a
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->tracking_click_url:Ljava/lang/String;

    .line 280
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    :goto_9
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->tracking_impression_url:Ljava/lang/String;

    if-nez v1, :cond_b

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->tracking_impression_url:Ljava/lang/String;

    if-nez v1, :cond_f

    goto :goto_a

    :cond_b
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->tracking_impression_url:Ljava/lang/String;

    .line 281
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    :goto_a
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->type:Ljava/lang/String;

    if-nez v1, :cond_c

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->type:Ljava/lang/String;

    if-nez v1, :cond_f

    goto :goto_b

    :cond_c
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->type:Ljava/lang/String;

    .line 282
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    :goto_b
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->url:Ljava/lang/String;

    if-nez v1, :cond_d

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->url:Ljava/lang/String;

    if-nez v1, :cond_f

    goto :goto_c

    :cond_d
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->url:Ljava/lang/String;

    .line 283
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    :goto_c
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->weight:Ljava/lang/Double;

    if-nez v1, :cond_e

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->weight:Ljava/lang/Double;

    if-nez p1, :cond_f

    goto :goto_d

    :cond_e
    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->weight:Ljava/lang/Double;

    .line 284
    invoke-virtual {v1, p1}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_f

    goto :goto_d

    :cond_f
    const/4 v0, 0x0

    :goto_d
    return v0

    :cond_10
    return v2
.end method

.method public hashCode()I
    .locals 4

    .line 291
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$hashCodeMemoized:Z

    if-nez v0, :cond_e

    .line 294
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 296
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->amount:Ljava/lang/Double;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Double;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 298
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->answer:Ljava/lang/String;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 300
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->content:Ljava/lang/String;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 302
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->engagement_id:Ljava/lang/Long;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_3
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 304
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 306
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->legal:Ljava/lang/String;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 308
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->linked_offer_ids:Ljava/util/List;

    if-nez v2, :cond_5

    const/4 v2, 0x0

    goto :goto_5

    :cond_5
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_5
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 310
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->options:Ljava/util/List;

    if-nez v2, :cond_6

    const/4 v2, 0x0

    goto :goto_6

    :cond_6
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_6
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 312
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->questions:Ljava/util/List;

    if-nez v2, :cond_7

    const/4 v2, 0x0

    goto :goto_7

    :cond_7
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_7
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 314
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->thumb:Ljava/lang/String;

    if-nez v2, :cond_8

    const/4 v2, 0x0

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 316
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->tracking_click_url:Ljava/lang/String;

    if-nez v2, :cond_9

    const/4 v2, 0x0

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 318
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->tracking_impression_url:Ljava/lang/String;

    if-nez v2, :cond_a

    const/4 v2, 0x0

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 320
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->type:Ljava/lang/String;

    if-nez v2, :cond_b

    const/4 v2, 0x0

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_b
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 322
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->url:Ljava/lang/String;

    if-nez v2, :cond_c

    const/4 v2, 0x0

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_c
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 324
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->weight:Ljava/lang/Double;

    if-nez v1, :cond_d

    goto :goto_d

    :cond_d
    invoke-virtual {v1}, Ljava/lang/Double;->hashCode()I

    move-result v3

    :goto_d
    xor-int/2addr v0, v3

    .line 325
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$hashCode:I

    const/4 v0, 0x1

    .line 326
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$hashCodeMemoized:Z

    .line 328
    :cond_e
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$hashCode:I

    return v0
.end method

.method public id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public legal()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->legal:Ljava/lang/String;

    return-object v0
.end method

.method public linked_offer_ids()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->linked_offer_ids:Ljava/util/List;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 199
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RewardFragment$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/RewardFragment$1;-><init>(Lcom/ibotta/android/graphql/fragment/RewardFragment;)V

    return-object v0
.end method

.method public options()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/RewardFragment$Option;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->options:Ljava/util/List;

    return-object v0
.end method

.method public questions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/RewardFragment$Question;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->questions:Ljava/util/List;

    return-object v0
.end method

.method public thumb()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->thumb:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 239
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 240
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RewardFragment{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", amount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->amount:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", answer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->answer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", content="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->content:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", engagement_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->engagement_id:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", legal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->legal:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", linked_offer_ids="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->linked_offer_ids:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", options="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->options:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", questions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->questions:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", thumb="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->thumb:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tracking_click_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->tracking_click_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tracking_impression_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->tracking_impression_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->weight:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$toString:Ljava/lang/String;

    .line 259
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$toString:Ljava/lang/String;

    return-object v0
.end method

.method public tracking_click_url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->tracking_click_url:Ljava/lang/String;

    return-object v0
.end method

.method public tracking_impression_url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->tracking_impression_url:Ljava/lang/String;

    return-object v0
.end method

.method public type()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->type:Ljava/lang/String;

    return-object v0
.end method

.method public url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->url:Ljava/lang/String;

    return-object v0
.end method

.method public weight()Ljava/lang/Double;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->weight:Ljava/lang/Double;

    return-object v0
.end method
