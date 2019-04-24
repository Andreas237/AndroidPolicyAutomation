.class Lcom/ibotta/android/graphql/fragment/ProductFragment$1;
.super Ljava/lang/Object;
.source "ProductFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/ProductFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/ProductFragment;)V
    .locals 0

    .line 211
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/ProductFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 2

    .line 214
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 215
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->action_button_text:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 216
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->action_button_type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 217
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->cache_key:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 218
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->current_value:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 219
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->deeplink_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 220
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->description:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 221
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 222
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->image_url_large:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 223
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->image_url_small:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 224
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->image_url_thumbnail:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 225
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->link:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 226
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 227
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xd

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->price:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    .line 228
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xe

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->retailer_id:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 229
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xf

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->sort_order:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 230
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 231
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x11

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductFragment;->typed_id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    return-void
.end method
