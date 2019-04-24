.class Lcom/ibotta/android/graphql/fragment/DealFragment$1;
.super Ljava/lang/Object;
.source "DealFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/DealFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/DealFragment;)V
    .locals 0

    .line 325
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 3

    .line 328
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 329
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->action_button_text:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 330
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->action_button_type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 331
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->button_info:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 332
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->cache_key:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 333
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->callback_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 334
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->deeplink_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 335
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->description:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 336
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->end_time:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 337
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 338
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->image_url_large:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 339
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->image_url_small:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 340
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->image_url_thumbnail:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 341
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xd

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->link:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 342
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xe

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 343
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xf

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->percent_back_text:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 344
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->price:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    .line 345
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x11

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->start_time:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 346
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x12

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->sort_results:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/DealFragment$1$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/DealFragment$1$1;-><init>(Lcom/ibotta/android/graphql/fragment/DealFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 352
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x13

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->sort_order:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 353
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x14

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->retailer_id:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 354
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x15

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 355
    sget-object v0, Lcom/ibotta/android/graphql/fragment/DealFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x16

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/DealFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/DealFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/DealFragment;->typed_id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    return-void
.end method
