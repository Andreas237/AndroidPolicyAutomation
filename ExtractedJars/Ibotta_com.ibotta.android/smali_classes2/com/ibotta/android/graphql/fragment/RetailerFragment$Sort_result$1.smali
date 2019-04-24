.class Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$1;
.super Ljava/lang/Object;
.source "RetailerFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result;)V
    .locals 0

    .line 1538
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 2

    .line 1541
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 1542
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result;

    invoke-static {v0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result;->access$400(Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result;)Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$Fragments;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$Fragments;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/apollographql/apollo/api/ResponseFieldMarshaller;->marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V

    return-void
.end method
