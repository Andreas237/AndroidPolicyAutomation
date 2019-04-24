.class Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$1;
.super Ljava/lang/Object;
.source "RetailerNodeFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 2

    .line 122
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 123
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->id:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeCustom(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;Ljava/lang/Object;)V

    .line 124
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 125
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->modelCImage:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->modelCImage:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseFieldMarshaller;)V

    .line 126
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->nearby:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeBoolean(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Boolean;)V

    .line 127
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->verificationType:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    return-void
.end method
