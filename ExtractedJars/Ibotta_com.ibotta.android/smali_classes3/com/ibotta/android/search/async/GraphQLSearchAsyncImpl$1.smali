.class Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl$1;
.super Ljava/lang/Object;
.source "GraphQLSearchAsyncImpl.java"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJobListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->search(Ljava/lang/String;Lcom/ibotta/api/model/search/SearchType;Ljava/lang/Long;Ljava/util/Set;Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;

.field final synthetic val$errorConsumer:Ljava9/util/function/Consumer;

.field final synthetic val$retailerId:Ljava/lang/Long;

.field final synthetic val$successConsumer:Ljava9/util/function/Consumer;


# direct methods
.method constructor <init>(Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;Ljava/lang/Long;Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl$1;->this$0:Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;

    iput-object p2, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl$1;->val$retailerId:Ljava/lang/Long;

    iput-object p3, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl$1;->val$successConsumer:Ljava9/util/function/Consumer;

    iput-object p4, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl$1;->val$errorConsumer:Ljava9/util/function/Consumer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 3

    .line 124
    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 125
    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    .line 126
    instance-of v0, p1, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;

    if-eqz v0, :cond_1

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl$1;->val$retailerId:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 128
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl$1;->val$successConsumer:Ljava9/util/function/Consumer;

    iget-object v2, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl$1;->this$0:Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;

    check-cast p1, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;

    invoke-static {v2, p1, v0}, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->access$000(Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;Ljava/lang/Integer;)Lcom/ibotta/api/model/search/SearchResults;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava9/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_1

    .line 129
    :cond_1
    instance-of v0, p1, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;

    if-eqz v0, :cond_2

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl$1;->val$successConsumer:Ljava9/util/function/Consumer;

    iget-object v1, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl$1;->this$0:Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;

    check-cast p1, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;

    invoke-static {v1, p1}, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->access$100(Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;)Lcom/ibotta/api/model/search/SearchResults;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava9/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_1

    .line 132
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid response for search job"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 135
    :cond_3
    iget-object v0, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl$1;->val$errorConsumer:Ljava9/util/function/Consumer;

    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->getException()Lcom/ibotta/api/ApiException;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava9/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    return-void
.end method
