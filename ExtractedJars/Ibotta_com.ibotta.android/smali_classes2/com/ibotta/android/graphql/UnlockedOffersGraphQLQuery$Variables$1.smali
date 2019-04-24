.class Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables$1;
.super Ljava/lang/Object;
.source "UnlockedOffersGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/InputFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables;->marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables;)V
    .locals 0

    .line 184
    iput-object p1, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables;

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

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables;->access$000(Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_0

    const-string v0, "limit"

    .line 188
    iget-object v1, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables;->access$000(Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeLong(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_0
    const-string v0, "products"

    .line 190
    iget-object v1, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables;->access$100(Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v0, "includeAvailableRetailers"

    .line 191
    iget-object v1, p0, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables;->access$200(Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Variables;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method
