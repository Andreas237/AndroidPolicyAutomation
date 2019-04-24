.class Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution$1;
.super Lcom/apollographql/apollo/ApolloCall$Callback;
.source "BaseGraphQLApiCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->waitForExecution(Lcom/apollographql/apollo/ApolloCall;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution$1;->this$1:Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;

    invoke-direct {p0}, Lcom/apollographql/apollo/ApolloCall$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lcom/apollographql/apollo/exception/ApolloException;)V
    .locals 1
    .param p1    # Lcom/apollographql/apollo/exception/ApolloException;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution$1;->this$1:Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;

    iget-object v0, v0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    invoke-static {v0}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->access$200(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 210
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution$1;->this$1:Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;

    invoke-static {v0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->access$502(Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;Lcom/apollographql/apollo/exception/ApolloException;)Lcom/apollographql/apollo/exception/ApolloException;

    .line 212
    iget-object p1, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution$1;->this$1:Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;

    iget-object p1, p1, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    invoke-static {p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->access$400(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)Ljava/util/concurrent/locks/Condition;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 214
    iget-object p1, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution$1;->this$1:Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;

    iget-object p1, p1, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    invoke-static {p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->access$200(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution$1;->this$1:Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;

    iget-object v0, v0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    invoke-static {v0}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->access$200(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public onResponse(Lcom/apollographql/apollo/api/Response;)V
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Response;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution$1;->this$1:Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;

    iget-object v0, v0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    invoke-static {v0}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->access$200(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 197
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution$1;->this$1:Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;

    invoke-static {v0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->access$302(Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;Lcom/apollographql/apollo/api/Response;)Lcom/apollographql/apollo/api/Response;

    .line 199
    iget-object p1, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution$1;->this$1:Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;

    iget-object p1, p1, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    invoke-static {p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->access$400(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)Ljava/util/concurrent/locks/Condition;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 201
    iget-object p1, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution$1;->this$1:Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;

    iget-object p1, p1, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    invoke-static {p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->access$200(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution$1;->this$1:Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;

    iget-object v0, v0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    invoke-static {v0}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->access$200(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method
