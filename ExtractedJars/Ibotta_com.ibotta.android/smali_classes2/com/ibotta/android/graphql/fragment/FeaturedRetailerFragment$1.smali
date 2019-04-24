.class Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$1;
.super Ljava/lang/Object;
.source "FeaturedRetailerFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 2

    .line 154
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 155
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->cache_key:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 156
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->icon_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 157
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 158
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->large_icon_url:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 159
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->model_c_retailer_image:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 160
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->link:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 161
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 162
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->retailer:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Retailer;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->retailer:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Retailer;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$Retailer;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseFieldMarshaller;)V

    .line 163
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->sort_order:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 164
    sget-object v0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/FeaturedRetailerFragment;->type:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    return-void
.end method
