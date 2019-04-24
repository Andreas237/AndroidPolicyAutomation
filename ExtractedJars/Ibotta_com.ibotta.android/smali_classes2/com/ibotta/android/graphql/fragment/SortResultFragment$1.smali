.class Lcom/ibotta/android/graphql/fragment/SortResultFragment$1;
.super Ljava/lang/Object;
.source "SortResultFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/SortResultFragment;->marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/SortResultFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/SortResultFragment;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/SortResultFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/SortResultFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/ResponseWriter;)V
    .locals 2

    .line 89
    sget-object v0, Lcom/ibotta/android/graphql/fragment/SortResultFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/SortResultFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/SortResultFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/SortResultFragment;->__typename:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 90
    sget-object v0, Lcom/ibotta/android/graphql/fragment/SortResultFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/SortResultFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/SortResultFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/SortResultFragment;->name:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 91
    sget-object v0, Lcom/ibotta/android/graphql/fragment/SortResultFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/SortResultFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/SortResultFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/SortResultFragment;->value:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    .line 92
    sget-object v0, Lcom/ibotta/android/graphql/fragment/SortResultFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/SortResultFragment$1;->this$0:Lcom/ibotta/android/graphql/fragment/SortResultFragment;

    iget-object v1, v1, Lcom/ibotta/android/graphql/fragment/SortResultFragment;->rank:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseWriter;->writeString(Lcom/apollographql/apollo/api/ResponseField;Ljava/lang/String;)V

    return-void
.end method
