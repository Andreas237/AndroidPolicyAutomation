.class Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$1;
.super Ljava/lang/Object;
.source "OffersByCategoryGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory;)V
    .locals 0

    .line 387
    iput-object p1, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$1;->this$0:Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 2

    .line 390
    sget-object v0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$1;->this$0:Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory;

    iget-object v1, v1, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 391
    iget-object v0, p0, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$1;->this$0:Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory;

    invoke-static {v0}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory;->access$500(Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory;)Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/apollographql/apollo/api/ResponseFieldMarshaller;->marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V

    return-void
.end method
