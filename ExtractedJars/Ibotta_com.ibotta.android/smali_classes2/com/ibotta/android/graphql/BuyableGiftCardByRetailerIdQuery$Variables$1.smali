.class Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables$1;
.super Ljava/lang/Object;
.source "BuyableGiftCardByRetailerIdQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/InputFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;->marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/InputFieldWriter;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "retailerId"

    .line 148
    iget-object v1, p0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;->access$000(Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeLong(Ljava/lang/String;Ljava/lang/Long;)V

    return-void
.end method
