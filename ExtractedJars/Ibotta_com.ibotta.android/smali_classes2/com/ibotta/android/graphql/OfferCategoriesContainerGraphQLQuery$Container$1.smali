.class Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container$1;
.super Ljava/lang/Object;
.source "OfferCategoriesContainerGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container;)V
    .locals 0

    .line 572
    iput-object p1, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container$1;->this$0:Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 2

    .line 575
    sget-object v0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container$1;->this$0:Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container;

    iget-object v1, v1, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 576
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container$1;->this$0:Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container;

    invoke-static {v0}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container;->access$600(Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container;)Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container$Fragments;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container$Fragments;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/apollographql/apollo/api/ResponseFieldMarshaller;->marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V

    return-void
.end method
