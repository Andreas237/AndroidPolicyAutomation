.class Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables$1;
.super Ljava/lang/Object;
.source "ModuleGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/InputFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;)V
    .locals 0

    .line 247
    iput-object p1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;

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

    const-string v0, "id"

    .line 250
    sget-object v1, Lcom/ibotta/android/graphql/type/CustomType;->ID:Lcom/ibotta/android/graphql/type/CustomType;

    iget-object v2, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;

    invoke-static {v2}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->access$000(Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeCustom(Ljava/lang/String;Lcom/apollographql/apollo/api/ScalarType;Ljava/lang/Object;)V

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->access$100(Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_0

    const-string v0, "expand"

    .line 252
    iget-object v1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->access$100(Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 254
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->access$200(Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_1

    const-string v0, "heroBoost"

    .line 255
    iget-object v1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->access$200(Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    :cond_1
    const-string v0, "products"

    .line 257
    iget-object v1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->access$300(Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v0, "includeAvailableRetailers"

    .line 258
    iget-object v1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;->access$400(Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Variables;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method
