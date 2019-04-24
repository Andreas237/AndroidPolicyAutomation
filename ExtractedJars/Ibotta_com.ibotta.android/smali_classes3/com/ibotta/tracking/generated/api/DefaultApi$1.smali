.class Lcom/ibotta/tracking/generated/api/DefaultApi$1;
.super Ljava/lang/Object;
.source "DefaultApi.java"

# interfaces
.implements Lcom/squareup/okhttp/Interceptor;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/tracking/generated/api/DefaultApi;->eventsTrackPostCall(Ljava/util/List;Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;)Lcom/squareup/okhttp/Call;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/tracking/generated/api/DefaultApi;

.field final synthetic val$progressListener:Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;


# direct methods
.method constructor <init>(Lcom/ibotta/tracking/generated/api/DefaultApi;Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/ibotta/tracking/generated/api/DefaultApi$1;->this$0:Lcom/ibotta/tracking/generated/api/DefaultApi;

    iput-object p2, p0, Lcom/ibotta/tracking/generated/api/DefaultApi$1;->val$progressListener:Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public intercept(Lcom/squareup/okhttp/Interceptor$Chain;)Lcom/squareup/okhttp/Response;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 94
    invoke-interface {p1}, Lcom/squareup/okhttp/Interceptor$Chain;->request()Lcom/squareup/okhttp/Request;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/squareup/okhttp/Interceptor$Chain;->proceed(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Response;

    move-result-object p1

    .line 95
    instance-of v0, p1, Lcom/squareup/okhttp/Response$Builder;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->newBuilder()Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    check-cast v0, Lcom/squareup/okhttp/Response$Builder;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->newBuilder(Lcom/squareup/okhttp/Response$Builder;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    :goto_0
    new-instance v1, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;

    .line 96
    instance-of v2, p1, Lcom/squareup/okhttp/Response;

    if-nez v2, :cond_1

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object p1

    goto :goto_1

    :cond_1
    check-cast p1, Lcom/squareup/okhttp/Response;

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object p1

    :goto_1
    iget-object v2, p0, Lcom/ibotta/tracking/generated/api/DefaultApi$1;->val$progressListener:Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;

    invoke-direct {v1, p1, v2}, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;-><init>(Lcom/squareup/okhttp/ResponseBody;Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;)V

    instance-of p1, v0, Lcom/squareup/okhttp/Response$Builder;

    if-nez p1, :cond_2

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/Response$Builder;->body(Lcom/squareup/okhttp/ResponseBody;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object p1

    goto :goto_2

    :cond_2
    check-cast v0, Lcom/squareup/okhttp/Response$Builder;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response$Builder;Lcom/squareup/okhttp/ResponseBody;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object p1

    .line 97
    :goto_2
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response$Builder;->build()Lcom/squareup/okhttp/Response;

    move-result-object p1

    return-object p1
.end method
