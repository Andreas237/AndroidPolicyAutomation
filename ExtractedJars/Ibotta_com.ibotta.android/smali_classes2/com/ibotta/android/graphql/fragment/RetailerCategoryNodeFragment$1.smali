.class Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$1;
.super Ljava/lang/Object;
.source "RetailerCategoryNodeFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 4

    .line 140
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 141
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 142
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 143
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->iconUrl:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->iconUrl:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$IconUrl;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseFieldMarshaller;)V

    .line 144
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->retailers:Ljava/util/List;

    new-instance v3, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$1$1;

    invoke-direct {v3, p0}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$1$1;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$1;)V

    invoke-interface {p1, v0, v1, v3}, Lcom/apollographql/apollo/api/ResponseWriter;->writeList(Lcom/apollographql/apollo/api/ResponseField;Ljava/util/List;Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;)V

    .line 150
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->features:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;->features:Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment$Features;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v2

    :cond_1
    invoke-interface {p1, v0, v2}, Lcom/apollographql/apollo/api/ResponseWriter;->writeObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseFieldMarshaller;)V

    return-void
.end method
