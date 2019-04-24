.class Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;
.super Ljava/lang/Object;
.source "BuyableGiftCardFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;)V
    .locals 0

    .line 256
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 3

    .line 259
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 260
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->cache_key:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 261
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->description:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 262
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->end_time:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 263
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 264
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->image_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 265
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->launch:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 266
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->link:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 267
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->max_purchase_amount:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    .line 268
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->min_purchase_amount:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    .line 269
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 270
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->pre_configured_denominations:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1$1;-><init>(Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 276
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseFieldMarshaller;)V

    .line 277
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xd

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer_id:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 278
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xe

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer_sku:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 279
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xf

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->reward_percentage:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    .line 280
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->sort_order:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 281
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x11

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->start_time:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 282
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x12

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->terms:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 283
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x13

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 284
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x14

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->typed_id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    return-void
.end method
