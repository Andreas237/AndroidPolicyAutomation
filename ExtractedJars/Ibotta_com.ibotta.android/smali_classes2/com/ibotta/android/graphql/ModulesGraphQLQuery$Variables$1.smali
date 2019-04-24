.class Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables$1;
.super Ljava/lang/Object;
.source "ModulesGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/InputFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;)V
    .locals 0

    .line 279
    iput-object p1, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;

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

    .line 282
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->access$000(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_0

    const-string v0, "limit"

    .line 283
    iget-object v1, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->access$000(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeLong(Ljava/lang/String;Ljava/lang/Long;)V

    .line 285
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->access$100(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_1

    const-string v0, "contentMin"

    .line 286
    iget-object v1, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->access$100(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeLong(Ljava/lang/String;Ljava/lang/Long;)V

    .line 288
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->access$200(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_2

    const-string v0, "contentMax"

    .line 289
    iget-object v1, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->access$200(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeLong(Ljava/lang/String;Ljava/lang/Long;)V

    .line 291
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->access$300(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_3

    const-string v0, "heroBoost"

    .line 292
    iget-object v1, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->access$300(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    :cond_3
    const-string v0, "products"

    .line 294
    iget-object v1, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->access$400(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v0, "includeAvailableRetailers"

    .line 295
    iget-object v1, p0, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;->access$500(Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Variables;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeBoolean(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method
