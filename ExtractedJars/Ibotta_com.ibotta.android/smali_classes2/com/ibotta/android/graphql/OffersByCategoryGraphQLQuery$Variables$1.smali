.class Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables$1;
.super Ljava/lang/Object;
.source "OffersByCategoryGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/InputFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;)V
    .locals 0

    .line 231
    iput-object p1, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;

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

    .line 234
    iget-object v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->access$000(Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_0

    const-string v0, "retailerId"

    .line 235
    iget-object v1, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->access$000(Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeLong(Ljava/lang/String;Ljava/lang/Long;)V

    .line 237
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->access$100(Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_1

    const-string v0, "categoryLimit"

    .line 238
    iget-object v1, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->access$100(Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeLong(Ljava/lang/String;Ljava/lang/Long;)V

    .line 240
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->access$200(Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_2

    const-string v0, "contentMax"

    .line 241
    iget-object v1, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->access$200(Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeLong(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_2
    const-string v0, "products"

    .line 243
    iget-object v1, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->access$300(Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v0, "includeAvailableRetailers"

    .line 244
    iget-object v1, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;->access$400(Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Variables;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method
