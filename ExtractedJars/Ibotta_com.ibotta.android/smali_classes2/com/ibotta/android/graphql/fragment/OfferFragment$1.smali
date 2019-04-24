.class Lcom/ibotta/android/graphql/fragment/OfferFragment$1;
.super Ljava/lang/Object;
.source "OfferFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/OfferFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/OfferFragment;)V
    .locals 0

    .line 722
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 3

    .line 725
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 726
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->about:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 727
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->about_title:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 728
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->activated:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 729
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->alternate_text:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 730
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->amount:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    .line 731
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->any_brand:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 732
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->available_at:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/OfferFragment$1$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$1$1;-><init>(Lcom/ibotta/android/graphql/fragment/OfferFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 738
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->block_customer_submitted_upcs:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 739
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->bonuses:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/OfferFragment$1$2;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$1$2;-><init>(Lcom/ibotta/android/graphql/fragment/OfferFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 745
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->button_info_map:Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->button_info_map:Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseFieldMarshaller;)V

    .line 746
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->cache_key:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 747
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->caption:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 748
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xd

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->categories:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/OfferFragment$1$3;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$1$3;-><init>(Lcom/ibotta/android/graphql/fragment/OfferFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 754
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xe

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->combo:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 755
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xf

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->combo_count:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 756
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->current_value:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 757
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x11

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->description:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 758
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x12

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->end_time:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 759
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x13

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->expiration:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 760
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x14

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->expiring_soon:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 761
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x15

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->hide_available_at:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 762
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x16

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 763
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x17

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->ignore_barcode:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 764
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x18

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->large_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 765
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x19

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->legal:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 766
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x1a

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->liked:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 767
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x1b

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->link:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 768
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x1c

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->multiples:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 769
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x1d

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->multiples_count:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 770
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x1e

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 771
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x1f

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->new_flag:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 772
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x20

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->non_item:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 773
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x21

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->non_item_total:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    .line 774
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x22

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_group_id:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 775
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x23

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_segment_id:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 776
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x24

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 777
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x25

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->old_value:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 778
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x26

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->pending:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 779
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x27

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->percent_back:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    .line 780
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x28

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->percent_back_max:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    .line 781
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x29

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->preselect:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 782
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x2a

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->products:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/OfferFragment$1$4;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$1$4;-><init>(Lcom/ibotta/android/graphql/fragment/OfferFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 788
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x2b

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->product_groups:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/OfferFragment$1$5;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$1$5;-><init>(Lcom/ibotta/android/graphql/fragment/OfferFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 794
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x2c

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->purchase_type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 795
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x2d

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->random_weight:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 796
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x2e

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->random_weight_total:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    .line 797
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x2f

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->redemption_max:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 798
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x30

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->retailers:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/OfferFragment$1$6;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$1$6;-><init>(Lcom/ibotta/android/graphql/fragment/OfferFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 804
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x31

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->retailer_exclusive:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 805
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x32

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->rewards:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/OfferFragment$1$7;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/OfferFragment$1$7;-><init>(Lcom/ibotta/android/graphql/fragment/OfferFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 811
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x33

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->score:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    .line 812
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x34

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->segment_id:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 813
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x35

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->self_funded:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 814
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x36

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->share_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 815
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x37

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->sort_order:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 816
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x38

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->start_time:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 817
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x39

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->terms:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 818
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x3a

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->thumb_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 819
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x3b

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->total_likes:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 820
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x3c

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 821
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x3d

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->typed_id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 822
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x3e

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 823
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x3f

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->variable_percent_back:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 824
    sget-object v0, Lcom/ibotta/android/graphql/fragment/OfferFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x40

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/OfferFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/OfferFragment;->verified:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    return-void
.end method
