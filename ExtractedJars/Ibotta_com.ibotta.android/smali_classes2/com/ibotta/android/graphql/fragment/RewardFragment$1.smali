.class Lcom/ibotta/android/graphql/fragment/RewardFragment$1;
.super Ljava/lang/Object;
.source "RewardFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/RewardFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/RewardFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/RewardFragment;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RewardFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 3

    .line 202
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RewardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 203
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RewardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->amount:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    .line 204
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RewardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->answer:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 205
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RewardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->content:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 206
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RewardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->engagement_id:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 207
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RewardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 208
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RewardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->legal:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 209
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RewardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->linked_offer_ids:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/RewardFragment$1$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/RewardFragment$1$1;-><init>(Lcom/ibotta/android/graphql/fragment/RewardFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 215
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RewardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->options:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/RewardFragment$1$2;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/RewardFragment$1$2;-><init>(Lcom/ibotta/android/graphql/fragment/RewardFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 221
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RewardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->questions:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/RewardFragment$1$3;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/RewardFragment$1$3;-><init>(Lcom/ibotta/android/graphql/fragment/RewardFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 227
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RewardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->thumb:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 228
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RewardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->tracking_click_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 229
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RewardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->tracking_impression_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 230
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xd

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RewardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 231
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xe

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RewardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 232
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RewardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xf

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RewardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RewardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RewardFragment;->weight:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    return-void
.end method
