.class Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables$1;
.super Ljava/lang/Object;
.source "BonusesGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/InputFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;)V
    .locals 0

    .line 226
    iput-object p1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;

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

    .line 229
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->access$000(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_1

    const-string v0, "retailerId"

    .line 230
    sget-object v1, Lcom/ibotta/android/graphql/type/CustomType;->ID:Lcom/ibotta/android/graphql/type/CustomType;

    iget-object v2, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;

    invoke-static {v2}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->access$000(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v2

    iget-object v2, v2, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;

    invoke-static {v2}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->access$000(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v2

    iget-object v2, v2, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1, v0, v1, v2}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeCustom(Ljava/lang/String;Lcom/apollographql/apollo/api/ScalarType;Ljava/lang/Object;)V

    .line 232
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->access$100(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_2

    const-string v0, "availableLimit"

    .line 233
    iget-object v1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->access$100(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeLong(Ljava/lang/String;Ljava/lang/Long;)V

    .line 235
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->access$200(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_3

    const-string v0, "completedLimit"

    .line 236
    iget-object v1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->access$200(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeLong(Ljava/lang/String;Ljava/lang/Long;)V

    .line 238
    :cond_3
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->access$300(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_4

    const-string v0, "featuredLimit"

    .line 239
    iget-object v1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;->access$300(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeLong(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_4
    return-void
.end method
