.class Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$1;
.super Ljava/lang/Object;
.source "ProductGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product;)V
    .locals 0

    .line 256
    iput-object p1, p0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$1;->this$0:Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 2

    .line 259
    sget-object v0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$1;->this$0:Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product;

    iget-object v1, v1, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 260
    iget-object v0, p0, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$1;->this$0:Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product;

    invoke-static {v0}, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product;->access$100(Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product;)Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/apollographql/apollo/api/ResponseFieldMarshaller;->marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V

    return-void
.end method
