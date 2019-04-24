.class Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables$1;
.super Ljava/lang/Object;
.source "RetailerCategoriesQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/InputFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;)V
    .locals 0

    .line 195
    iput-object p1, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public marshal(Lcom/apollographql/apollo/api/InputFieldWriter;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "customerId"

    .line 198
    sget-object v1, Lcom/ibotta/android/graphql/type/CustomType;->ID:Lcom/ibotta/android/graphql/type/CustomType;

    iget-object v2, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;

    invoke-static {v2}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->access$000(Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeCustom(Ljava/lang/String;Lcom/apollographql/apollo/api/ScalarType;Ljava/lang/Object;)V

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->access$100(Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_0

    const-string v0, "includeFullResponse"

    .line 200
    iget-object v1, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->access$100(Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 202
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->access$200(Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_1

    const-string v0, "categoryRetailersLimit"

    .line 203
    iget-object v1, p0, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;->access$200(Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeLong(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_1
    return-void
.end method
