.class Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Data$1;
.super Ljava/lang/Object;
.source "BuyableGiftCardByIdQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Data;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Data;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Data;)V
    .locals 0

    .line 184
    iput-object p1, p0, Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Data$1;->this$0:Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Data;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 2

    .line 187
    sget-object v0, Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Data;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Data$1;->this$0:Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Data;

    iget-object v1, v1, Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Data;->buyableGiftCard:Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$BuyableGiftCard;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Data$1;->this$0:Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Data;

    iget-object v1, v1, Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Data;->buyableGiftCard:Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$BuyableGiftCard;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$BuyableGiftCard;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseFieldMarshaller;)V

    return-void
.end method
