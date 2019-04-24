.class Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables$1;
.super Ljava/lang/Object;
.source "OfferTagSearchQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/InputFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;->marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;)V
    .locals 0

    .line 176
    iput-object p1, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/InputFieldWriter;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "name"

    .line 179
    iget-object v1, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;->access$000(Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "products"

    .line 180
    iget-object v1, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;->access$100(Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v0, "includeAvailableRetailers"

    .line 181
    iget-object v1, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;->access$200(Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method
