.class Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables$1;
.super Ljava/lang/Object;
.source "EngagementsGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/InputFieldMarshaller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;->marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;

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

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;

    invoke-static {v0}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;->access$000(Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iget-boolean v0, v0, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_1

    const-string v0, "rewardIds"

    .line 146
    iget-object v1, p0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables$1;->this$0:Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;

    invoke-static {v1}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;->access$000(Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables;)Lcom/apollographql/apollo/api/Input;

    move-result-object v1

    iget-object v1, v1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    if-eqz v1, :cond_0

    new-instance v1, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables$1$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables$1$1;-><init>(Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Variables$1;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/InputFieldWriter;->writeList(Ljava/lang/String;Lcom/apollographql/apollo/api/InputFieldWriter$ListWriter;)V

    :cond_1
    return-void
.end method
