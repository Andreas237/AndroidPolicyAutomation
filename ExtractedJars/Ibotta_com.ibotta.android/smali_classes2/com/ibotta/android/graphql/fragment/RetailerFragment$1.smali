.class Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;
.super Ljava/lang/Object;
.source "RetailerFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/RetailerFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/RetailerFragment;)V
    .locals 0

    .line 497
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 4

    .line 500
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 501
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 502
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->active:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 503
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->barcode:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 504
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->button_info:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->button_info:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseFieldMarshaller;)V

    .line 505
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->cache_key:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 506
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->card_signup_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 507
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->credit_pending_period:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 508
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->device_ocr_enabled:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 509
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->expiration:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 510
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->favorite:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 511
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->gallery_features:Ljava/util/List;

    new-instance v3, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1$1;

    invoke-direct {v3, p0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1$1;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;)V

    invoke-interface {p1, v0, v1, v3}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 517
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->home_sort_order:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 518
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xd

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->hotness:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    .line 519
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xe

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->icon_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 520
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xf

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->large_icon_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 521
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->model_c_retailer_image:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 522
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x11

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->link:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 523
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x12

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 524
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x13

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->nearby:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 525
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x14

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->parent_retailer_id:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 526
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x15

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->primary_category_id:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 527
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x16

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->pwi_home_banner_image:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 528
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x17

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->purchase_location:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 529
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x18

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->offer_count:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 530
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x19

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->receipt_formats:Ljava/util/List;

    new-instance v3, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1$2;

    invoke-direct {v3, p0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1$2;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;)V

    invoke-interface {p1, v0, v1, v3}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 536
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x1a

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->redemption_meta:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->redemption_meta:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseFieldMarshaller;)V

    .line 537
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x1b

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->retailer_barcode_configuration:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->retailer_barcode_configuration:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v2

    :cond_2
    invoke-interface {p1, v0, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseFieldMarshaller;)V

    .line 538
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x1c

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->retailer_terms:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 539
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x1d

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->score:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    .line 540
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x1e

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->short_description:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 541
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x1f

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->sort_results:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1$3;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1$3;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 547
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x20

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->sort_order:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 548
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x21

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 549
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x22

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->typed_id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 550
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x23

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->verification_type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    return-void
.end method
