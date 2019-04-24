.class public Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final TAG:Ljava/lang/String; = "AsyncHttpRequest"


# instance fields
.field private cancelIsNotified:Z

.field private executionCount:I

.field private final httpClient:Lorg/apache/http/impl/client/AbstractHttpClient;

.field private final httpContext:Lorg/apache/http/protocol/HttpContext;

.field private final httpUriRequest:Lorg/apache/http/client/methods/HttpUriRequest;

.field private isCancelled:Z

.field private isFinished:Z

.field private final responseHandler:Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;


# direct methods
.method public constructor <init>(Lorg/apache/http/impl/client/AbstractHttpClient;Lorg/apache/http/protocol/HttpContext;Lorg/apache/http/client/methods/HttpUriRequest;Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;)V
    .locals 2

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isCancelled:Z

    .line 19
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->cancelIsNotified:Z

    .line 20
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isFinished:Z

    .line 24
    const-string v0, "AsyncHttpRequest"

    const-string v1, "enter AsyncHttpRequest"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    iput-object p1, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->httpClient:Lorg/apache/http/impl/client/AbstractHttpClient;

    .line 26
    iput-object p2, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->httpContext:Lorg/apache/http/protocol/HttpContext;

    .line 27
    iput-object p3, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->httpUriRequest:Lorg/apache/http/client/methods/HttpUriRequest;

    .line 28
    iput-object p4, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->responseHandler:Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;

    .line 29
    return-void
.end method

.method private makeRequest()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 75
    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    const-string v0, "AsyncHttpRequest"

    const-string v1, "judge isCancelled"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    return-void

    .line 79
    :cond_0
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->httpUriRequest:Lorg/apache/http/client/methods/HttpUriRequest;

    invoke-interface {v0}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 80
    const-string v0, "AsyncHttpRequest"

    const-string v1, "judge httpUriRequest"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    new-instance v0, Ljava/net/MalformedURLException;

    const-string v1, "No valid URI scheme was provided"

    invoke-direct {v0, v1}, Ljava/net/MalformedURLException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 83
    :cond_1
    const-string v0, "AysncHttpClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==>get response before"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->httpClient:Lorg/apache/http/impl/client/AbstractHttpClient;

    iget-object v1, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->httpUriRequest:Lorg/apache/http/client/methods/HttpUriRequest;

    invoke-virtual {v0, v1}, Lorg/apache/http/impl/client/AbstractHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v4

    .line 85
    const-string v0, "AsyncHttpRequest"

    const-string v1, "midle"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    const-string v0, "AysncHttpClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==>get response after"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v3

    invoke-interface {v3}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->responseHandler:Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;

    if-eqz v0, :cond_2

    .line 88
    const-string v0, "AsyncHttpRequest"

    const-string v1, "judge isCancelled"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->responseHandler:Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;

    invoke-interface {v0, v4}, Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;->sendResponseMessage(Lorg/apache/http/HttpResponse;)V

    .line 91
    :cond_2
    return-void
.end method

.method private makeRequestWithRetries()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 94
    const/4 v2, 0x1

    .line 95
    const/4 v3, 0x0

    .line 96
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->httpClient:Lorg/apache/http/impl/client/AbstractHttpClient;

    invoke-virtual {v0}, Lorg/apache/http/impl/client/AbstractHttpClient;->getHttpRequestRetryHandler()Lorg/apache/http/client/HttpRequestRetryHandler;

    move-result-object v4

    .line 98
    :cond_0
    :goto_0
    if-eqz v2, :cond_3

    .line 100
    const-string v0, "AsyncHttpRequest"

    const-string v1, "try"

    :try_start_0
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->makeRequest()V

    .line 102
    const-string v0, "AsyncHttpRequest"

    const-string v1, "try"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 103
    return-void

    .line 104
    :catch_0
    move-exception v5

    .line 105
    const-string v0, "AsyncHttpRequest"

    const-string v1, "try"

    :try_start_1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 106
    new-instance v3, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UnknownHostException exception:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Ljava/net/UnknownHostException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 107
    iget v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->executionCount:I

    if-lez v0, :cond_1

    iget v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->executionCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->executionCount:I

    iget-object v1, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->httpContext:Lorg/apache/http/protocol/HttpContext;

    invoke-interface {v4, v3, v0, v1}, Lorg/apache/http/client/HttpRequestRetryHandler;->retryRequest(Ljava/io/IOException;ILorg/apache/http/protocol/HttpContext;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 115
    :goto_1
    goto :goto_2

    .line 108
    :catch_1
    move-exception v5

    .line 109
    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 110
    const-string v0, "AsyncHttpRequest"

    const-string v1, "isCancelled"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 111
    return-void

    .line 113
    :cond_2
    move-object v3, v5

    .line 114
    :try_start_2
    iget v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->executionCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->executionCount:I

    iget-object v1, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->httpContext:Lorg/apache/http/protocol/HttpContext;

    invoke-interface {v4, v3, v0, v1}, Lorg/apache/http/client/HttpRequestRetryHandler;->retryRequest(Ljava/io/IOException;ILorg/apache/http/protocol/HttpContext;)Z

    move-result v2

    .line 116
    :goto_2
    if-eqz v2, :cond_0

    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->responseHandler:Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;

    if-eqz v0, :cond_0

    .line 117
    const-string v0, "AsyncHttpRequest"

    const-string v1, "isCancelled"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->responseHandler:Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;

    iget v1, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->executionCount:I

    invoke-interface {v0, v1}, Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;->sendRetryMessage(I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_0

    .line 125
    :cond_3
    goto :goto_3

    .line 121
    :catch_2
    move-exception v5

    .line 122
    const-string v0, "AsyncHttpRequest"

    const-string v1, "try"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    const-string v0, "AsyncHttpRequest"

    const-string v1, "Unhandled exception origin cause"

    invoke-static {v0, v1, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 124
    new-instance v3, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unhandled exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 126
    :goto_3
    throw v3
.end method

.method private declared-synchronized sendCancelNotification()V
    .locals 2

    monitor-enter p0

    .line 139
    :try_start_0
    iget-boolean v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isFinished:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isCancelled:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->cancelIsNotified:Z

    if-nez v0, :cond_0

    .line 140
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->cancelIsNotified:Z

    .line 141
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->responseHandler:Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;

    if-eqz v0, :cond_0

    .line 142
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->responseHandler:Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;

    invoke-interface {v0}, Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;->sendCancelMessage()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method


# virtual methods
.method public cancel(Z)Z
    .locals 1

    .line 152
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isCancelled:Z

    .line 153
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->httpUriRequest:Lorg/apache/http/client/methods/HttpUriRequest;

    invoke-interface {v0}, Lorg/apache/http/client/methods/HttpUriRequest;->abort()V

    .line 154
    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public isCancelled()Z
    .locals 1

    .line 132
    iget-boolean v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isCancelled:Z

    if-eqz v0, :cond_0

    .line 133
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->sendCancelNotification()V

    .line 135
    :cond_0
    iget-boolean v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isCancelled:Z

    return v0
.end method

.method public isDone()Z
    .locals 1

    .line 148
    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isFinished:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public run()V
    .locals 5

    .line 33
    const-string v0, "AsyncHttpRequest"

    const-string v1, " enter start run"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 35
    const-string v0, "AsyncHttpRequest"

    const-string v1, "judge isCancelled"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    return-void

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->responseHandler:Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;

    if-eqz v0, :cond_1

    .line 40
    const-string v0, "AsyncHttpRequest"

    const-string v1, "if responseHandler is null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->responseHandler:Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;

    invoke-interface {v0}, Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;->sendStartMessage()V

    .line 44
    :cond_1
    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 45
    const-string v0, "AsyncHttpRequest"

    const-string v1, "judge isCancelled"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    return-void

    .line 50
    :cond_2
    :try_start_0
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->makeRequestWithRetries()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    goto :goto_0

    .line 51
    :catch_0
    move-exception v4

    .line 52
    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->responseHandler:Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;

    if-eqz v0, :cond_3

    .line 53
    const-string v0, "AsyncHttpRequest"

    const-string v1, "!isCancelled() && responseHandler != null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->responseHandler:Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;->sendFailureMessage(I[Lorg/apache/http/Header;[BLjava/lang/Throwable;)V

    goto :goto_0

    .line 56
    :cond_3
    const-string v0, "AsyncHttpRequest"

    const-string v1, "makeRequestWithRetries returned error, but handler is null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    :goto_0
    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 61
    const-string v0, "AsyncHttpRequest"

    const-string v1, "judge isCancelled"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    return-void

    .line 65
    :cond_4
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->responseHandler:Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;

    if-eqz v0, :cond_5

    .line 66
    const-string v0, "AsyncHttpRequest"

    const-string v1, "responseHandler not is null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->responseHandler:Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;

    invoke-interface {v0}, Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;->sendFinishMessage()V

    .line 70
    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isFinished:Z

    .line 71
    const-string v0, "AsyncHttpRequest"

    const-string v1, "end run"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    return-void
.end method
