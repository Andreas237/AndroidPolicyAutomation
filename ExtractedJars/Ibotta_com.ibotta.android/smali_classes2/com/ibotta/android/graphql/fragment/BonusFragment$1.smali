.class Lcom/ibotta/android/graphql/fragment/BonusFragment$1;
.super Ljava/lang/Object;
.source "BonusFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/BonusFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/BonusFragment;)V
    .locals 0

    .line 409
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 3

    .line 412
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 413
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->active:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 414
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->amount:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    .line 415
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->bonus_qualifications:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/BonusFragment$1$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/BonusFragment$1$1;-><init>(Lcom/ibotta/android/graphql/fragment/BonusFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 421
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->bonus_type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 422
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->cache_key:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 423
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->completed:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 424
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->completed_image_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 425
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->customer_started_time:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 426
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->description:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 427
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->elegible:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 428
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->expiration:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 429
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 430
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xd

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->level:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 431
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xe

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->link:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 432
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xf

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->locked:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 433
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->max_retailer_distance:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 434
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x11

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 435
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x12

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->offers:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/BonusFragment$1$2;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/BonusFragment$1$2;-><init>(Lcom/ibotta/android/graphql/fragment/BonusFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 441
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x13

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->other_reward:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 442
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x14

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->percent_complete:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    .line 443
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x15

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->progress_color:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 444
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x16

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->progress_count:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    .line 445
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x17

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->quest:Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->quest:Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Quest;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseFieldMarshaller;)V

    .line 446
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x18

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->retailer_id:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 447
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x19

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->score:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    .line 448
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x1a

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->sort_order:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 449
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x1b

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->sort_results:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/BonusFragment$1$3;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/BonusFragment$1$3;-><init>(Lcom/ibotta/android/graphql/fragment/BonusFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 455
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x1c

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->terms:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 456
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x1d

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 457
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x1e

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->typed_id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 458
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x1f

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->uncompleted_image_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 459
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x20

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/BonusFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/BonusFragment;->weight:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    return-void
.end method
