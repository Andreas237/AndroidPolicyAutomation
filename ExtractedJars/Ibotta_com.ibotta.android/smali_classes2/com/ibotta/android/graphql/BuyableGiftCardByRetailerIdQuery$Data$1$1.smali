.class Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data$1$1;
.super Ljava/lang/Object;
.source "BuyableGiftCardByRetailerIdQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseWriter$ListWriter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data$1;->marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data$1;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data$1;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data$1$1;->this$1:Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public write(Ljava/lang/Object;Lcom/apollographql/apollo/api/ResponseWriter$ListItemWriter;)V
    .locals 0

    .line 190
    check-cast p1, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$BuyableGiftCard;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$BuyableGiftCard;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/apollographql/apollo/api/ResponseWriter$ListItemWriter;->writeObject(Lcom/apollographql/apollo/api/ResponseFieldMarshaller;)V

    return-void
.end method
