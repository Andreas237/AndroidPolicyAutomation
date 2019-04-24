.class Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables$1$1;
.super Ljava/lang/Object;
.source "RetailersGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/InputFieldWriter$ListWriter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables$1;->marshal(Lcom/apollographql/apollo/api/InputFieldWriter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables$1;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables$1;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables$1$1;->this$1:Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public write(Lcom/apollographql/apollo/api/InputFieldWriter$ListItemWriter;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables$1$1;->this$1:Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables$1;

    iget-object v0, v0, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables;->access$000(Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-object v0, v0, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 185
    sget-object v2, Lcom/ibotta/android/graphql/type/CustomType;->ID:Lcom/ibotta/android/graphql/type/CustomType;

    invoke-interface {p1, v2, v1}, Lcom/apollographql/apollo/api/InputFieldWriter$ListItemWriter;->writeCustom(Lcom/apollographql/apollo/api/ScalarType;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method
