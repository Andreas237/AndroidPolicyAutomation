.class Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment$1;
.super Ljava/lang/Object;
.source "OfferRewardQuestionFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 3

    .line 114
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 115
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 116
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->answer:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 117
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->content:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 118
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->multiple_response:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 119
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->options:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment$1$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment$1$1;-><init>(Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 125
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferRewardQuestionFragment;->url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    return-void
.end method
