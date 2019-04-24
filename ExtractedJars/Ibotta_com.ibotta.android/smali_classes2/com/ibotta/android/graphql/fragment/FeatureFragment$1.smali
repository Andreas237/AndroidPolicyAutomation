.class Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;
.super Ljava/lang/Object;
.source "FeatureFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/FeatureFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/FeatureFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/FeatureFragment;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 3

    .line 212
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 213
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 214
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->bgcolor:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 215
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->big_img:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 216
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->cache_key:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 217
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->category_img:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 218
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->context:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 219
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->expiration:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 220
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->feature_type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 221
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->link:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 222
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 223
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->sort_results:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1$1;-><init>(Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 229
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->sort_order:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 230
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xd

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->tracking_click_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 231
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xe

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->tracking_impression_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 232
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xf

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 233
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeatureFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeatureFragment;->typed_id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    return-void
.end method
