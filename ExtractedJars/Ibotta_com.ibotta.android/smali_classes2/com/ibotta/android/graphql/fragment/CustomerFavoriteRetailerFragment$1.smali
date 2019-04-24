.class Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$1;
.super Ljava/lang/Object;
.source "CustomerFavoriteRetailerFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 3

    .line 106
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 107
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;

    iget-wide v1, v1, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->retailerId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 108
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->favoriteDate:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 109
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->sortOrder:Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeLong(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/Long;)V

    .line 110
    sget-object v0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->retailer:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment;->retailer:Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/CustomerFavoriteRetailerFragment$Retailer;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseFieldMarshaller;)V

    return-void
.end method
