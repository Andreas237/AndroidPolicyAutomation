.class Lcom/ibotta/android/graphql/fragment/ProductGroupFragment$1;
.super Ljava/lang/Object;
.source "ProductGroupFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 3

    .line 131
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 132
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 133
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->ignore_barcode:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 134
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->multiples_count:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 135
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->multiples:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 136
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 137
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->products:Ljava/util/List;

    new-instance v2, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment$1$1;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment$1$1;-><init>(Lcom/ibotta/android/graphql/fragment/ProductGroupFragment$1;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 143
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->random_weight_total:Ljava/lang/Double;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeDouble(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Double;)V

    .line 144
    sget-object v0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;->random_weight:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    return-void
.end method
