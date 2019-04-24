.class Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;
.super Ljava/lang/Object;
.source "CategoryFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/CategoryFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/CategoryFragment;)V
    .locals 0

    .line 234
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 3

    .line 237
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 238
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 239
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->cache_key:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 240
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->category_type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 241
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 242
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->collapsible:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 243
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->default_view_state:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 244
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->end_time:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 245
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->expiration:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 246
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->icon_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 247
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->image_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 248
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->launch:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 249
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 250
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xd

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->short_name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 251
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xe

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->num_preview_items:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 252
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xf

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->raw_category_type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 253
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->retailers:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1$1;-><init>(Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 259
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x11

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->sort_order:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 260
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x12

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->start_time:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 261
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x13

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CategoryFragment;->content:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1$2;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/CategoryFragment$1$2;-><init>(Lcom/ibotta/android/graphql/fragment/CategoryFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    return-void
.end method
