.class Lcom/ibotta/tracking/generated/invoker/ApiClient$1;
.super Ljava/lang/Object;
.source "ApiClient.java"

# interfaces
.implements Lcom/squareup/okhttp/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/tracking/generated/invoker/ApiClient;->executeAsync(Lcom/squareup/okhttp/Call;Ljava/lang/reflect/Type;Lcom/ibotta/tracking/generated/invoker/ApiCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/tracking/generated/invoker/ApiClient;

.field final synthetic val$callback:Lcom/ibotta/tracking/generated/invoker/ApiCallback;

.field final synthetic val$returnType:Ljava/lang/reflect/Type;


# direct methods
.method constructor <init>(Lcom/ibotta/tracking/generated/invoker/ApiClient;Lcom/ibotta/tracking/generated/invoker/ApiCallback;Ljava/lang/reflect/Type;)V
    .locals 0

    .line 872
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient$1;->this$0:Lcom/ibotta/tracking/generated/invoker/ApiClient;

    iput-object p2, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient$1;->val$callback:Lcom/ibotta/tracking/generated/invoker/ApiCallback;

    iput-object p3, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient$1;->val$returnType:Ljava/lang/reflect/Type;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lcom/squareup/okhttp/Request;Ljava/io/IOException;)V
    .locals 2

    .line 875
    iget-object p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient$1;->val$callback:Lcom/ibotta/tracking/generated/invoker/ApiCallback;

    new-instance v0, Lcom/ibotta/tracking/generated/invoker/ApiException;

    invoke-direct {v0, p2}, Lcom/ibotta/tracking/generated/invoker/ApiException;-><init>(Ljava/lang/Throwable;)V

    const/4 p2, 0x0

    const/4 v1, 0x0

    invoke-interface {p1, v0, p2, v1}, Lcom/ibotta/tracking/generated/invoker/ApiCallback;->onFailure(Lcom/ibotta/tracking/generated/invoker/ApiException;ILjava/util/Map;)V

    return-void
.end method

.method public onResponse(Lcom/squareup/okhttp/Response;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 882
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient$1;->this$0:Lcom/ibotta/tracking/generated/invoker/ApiClient;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient$1;->val$returnType:Ljava/lang/reflect/Type;

    invoke-virtual {v0, p1, v1}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->handleResponse(Lcom/squareup/okhttp/Response;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Lcom/ibotta/tracking/generated/invoker/ApiException; {:try_start_0 .. :try_end_0} :catch_0

    .line 887
    iget-object v1, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient$1;->val$callback:Lcom/ibotta/tracking/generated/invoker/ApiCallback;

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->code()I

    move-result v2

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object p1

    invoke-virtual {p1}, Lcom/squareup/okhttp/Headers;->toMultimap()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v1, v0, v2, p1}, Lcom/ibotta/tracking/generated/invoker/ApiCallback;->onSuccess(Ljava/lang/Object;ILjava/util/Map;)V

    return-void

    :catch_0
    move-exception v0

    .line 884
    iget-object v1, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient$1;->val$callback:Lcom/ibotta/tracking/generated/invoker/ApiCallback;

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->code()I

    move-result v2

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object p1

    invoke-virtual {p1}, Lcom/squareup/okhttp/Headers;->toMultimap()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v1, v0, v2, p1}, Lcom/ibotta/tracking/generated/invoker/ApiCallback;->onFailure(Lcom/ibotta/tracking/generated/invoker/ApiException;ILjava/util/Map;)V

    return-void
.end method
