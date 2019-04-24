.class Lcom/ibotta/android/graphql/fragment/EngagementFragment$1;
.super Ljava/lang/Object;
.source "EngagementFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/EngagementFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 3

    .line 183
    sget-object v0, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 184
    sget-object v0, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->answer:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 185
    sget-object v0, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->content:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 186
    sget-object v0, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 187
    sget-object v0, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->legal:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 188
    sget-object v0, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->linked_offer_ids:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1$1;-><init>(Lcom/ibotta/android/graphql/fragment/EngagementFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 194
    sget-object v0, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->options:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1$2;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1$2;-><init>(Lcom/ibotta/android/graphql/fragment/EngagementFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 200
    sget-object v0, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->questions:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1$3;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1$3;-><init>(Lcom/ibotta/android/graphql/fragment/EngagementFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 206
    sget-object v0, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->reward_id:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 207
    sget-object v0, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->thumb:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 208
    sget-object v0, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->tracking_click_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 209
    sget-object v0, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->tracking_impression_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 210
    sget-object v0, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 211
    sget-object v0, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xd

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/EngagementFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/EngagementFragment;->url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    return-void
.end method
