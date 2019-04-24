.class Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category$1;
.super Ljava/lang/Object;
.source "CategoryGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;)V
    .locals 0

    .line 336
    iput-object p1, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category$1;->this$0:Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 2

    .line 339
    sget-object v0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category$1;->this$0:Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;

    iget-object v1, v1, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 340
    iget-object v0, p0, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category$1;->this$0:Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;

    invoke-static {v0}, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;->access$400(Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;)Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category$Fragments;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category$Fragments;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/apollographql/apollo/api/ResponseFieldMarshaller;->marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V

    return-void
.end method
