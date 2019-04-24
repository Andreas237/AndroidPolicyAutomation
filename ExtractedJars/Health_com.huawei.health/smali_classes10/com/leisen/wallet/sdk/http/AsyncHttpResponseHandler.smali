.class public abstract Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler$ResponderHandler;
    }
.end annotation


# static fields
.field protected static final BUFFER_SIZE:I = 0x1000

.field protected static final CANCEL_MESSAGE:I = 0x6

.field public static final DEFAULT_CAHRSET:Ljava/lang/String; = "UTF_8"

.field protected static final FALIURE_MESSAGE:I = 0x1

.field protected static final FINISH_MESSAGE:I = 0x3

.field protected static final PROGRESS_MESSAGE:I = 0x4

.field protected static final RETRY_MESSAGE:I = 0x5

.field protected static final START_MESSAGE:I = 0x2

.field protected static final SUCCESS_MESSAGE:I = 0x0

.field public static final TAG:Ljava/lang/String; = "AsyncHttpResponseHandler"


# instance fields
.field private handler:Landroid/os/Handler;

.field private requestHeaders:[Lorg/apache/http/Header;

.field private requestURI:Ljava/net/URI;

.field private responseCharset:Ljava/lang/String;

.field private useSynchronousMode:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const-string v0, "UTF_8"

    iput-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->responseCharset:Ljava/lang/String;

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->requestURI:Ljava/net/URI;

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->requestHeaders:[Lorg/apache/http/Header;

    .line 45
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->setUseSynchronousMode(Z)V

    .line 46
    return-void
.end method

.method private getResponseData(Lorg/apache/http/HttpEntity;)[B
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 263
    const-string v0, "AsyncHttpResponseHandler"

    const-string v1, "enter getResponseData"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 264
    const/4 v2, 0x0

    .line 265
    if-eqz p1, :cond_4

    .line 266
    const-string v0, "AsyncHttpResponseHandler"

    const-string v1, "enter getResponseData and entity not null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 267
    invoke-interface {p1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v3

    .line 268
    if-eqz v3, :cond_4

    .line 269
    const-string v0, "AsyncHttpResponseHandler"

    const-string v1, "enter getResponseData and instream not null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 270
    invoke-interface {p1}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v4

    .line 271
    const-wide/32 v0, 0x7fffffff

    cmp-long v0, v4, v0

    if-lez v0, :cond_0

    .line 272
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "HTTP entity too large to be buffered in memory"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 274
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-gez v0, :cond_1

    const/16 v6, 0x1000

    goto :goto_0

    :cond_1
    long-to-int v6, v4

    .line 276
    :goto_0
    :try_start_0
    new-instance v7, Lorg/apache/http/util/ByteArrayBuffer;

    invoke-direct {v7, v6}, Lorg/apache/http/util/ByteArrayBuffer;-><init>(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 278
    const/16 v0, 0x1000

    :try_start_1
    new-array v8, v0, [B

    .line 279
    const/4 v10, 0x0

    .line 281
    :goto_1
    invoke-virtual {v3, v8}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v9, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_3

    .line 282
    add-int/2addr v10, v9

    .line 283
    const/4 v0, 0x0

    invoke-virtual {v7, v8, v0, v9}, Lorg/apache/http/util/ByteArrayBuffer;->append([BII)V

    .line 284
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-gtz v0, :cond_2

    const-wide/16 v0, 0x1

    goto :goto_2

    :cond_2
    move-wide v0, v4

    :goto_2
    long-to-int v0, v0

    invoke-virtual {p0, v10, v0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->sendProgressMessage(II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 287
    :cond_3
    :try_start_2
    invoke-static {v3}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->silentCloseInputStream(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0

    .line 288
    goto :goto_3

    .line 287
    :catchall_0
    move-exception v11

    :try_start_3
    invoke-static {v3}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->silentCloseInputStream(Ljava/io/InputStream;)V

    .line 288
    throw v11

    .line 289
    :goto_3
    invoke-virtual {v7}, Lorg/apache/http/util/ByteArrayBuffer;->toByteArray()[B
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_0

    move-result-object v2

    .line 293
    goto :goto_4

    .line 290
    :catch_0
    move-exception v7

    .line 292
    new-instance v0, Ljava/io/IOException;

    const-string v1, "File too large to fit into available memory"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 296
    :cond_4
    :goto_4
    const-string v0, "AsyncHttpResponseHandler"

    const-string v1, "exit getResponseData"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 297
    return-object v2
.end method

.method private obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
    .locals 2

    .line 244
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->handler:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 245
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 246
    if-eqz v1, :cond_1

    .line 247
    iput p1, v1, Landroid/os/Message;->what:I

    .line 248
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    goto :goto_0

    .line 251
    :cond_0
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->handler:Landroid/os/Handler;

    invoke-static {v0, p1, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    .line 253
    :cond_1
    :goto_0
    return-object v1
.end method

.method private sendMessage(Landroid/os/Message;)V
    .locals 1

    .line 178
    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->getUseSynchronousMode()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->handler:Landroid/os/Handler;

    if-nez v0, :cond_1

    .line 179
    :cond_0
    invoke-virtual {p0, p1}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->handleMessage(Landroid/os/Message;)V

    goto :goto_0

    .line 180
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_2

    .line 181
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->handler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 183
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public getCharset()Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->responseCharset:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "UTF_8"

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->responseCharset:Ljava/lang/String;

    :goto_0
    return-object v0
.end method

.method public getRequestHeaders()[Lorg/apache/http/Header;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->requestHeaders:[Lorg/apache/http/Header;

    return-object v0
.end method

.method public getRequestURI()Ljava/net/URI;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->requestURI:Ljava/net/URI;

    return-object v0
.end method

.method public getUseSynchronousMode()Z
    .locals 1

    .line 98
    iget-boolean v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->useSynchronousMode:Z

    return v0
.end method

.method protected handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 192
    const-string v0, "AsyncHttpResponseHandler"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "message : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 195
    :pswitch_0
    const-string v0, "AsyncHttpResponseHandler"

    const-string v1, "handlerMessage SUCCESS_MESSAGE"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 196
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, [Ljava/lang/Object;

    .line 197
    if-eqz v4, :cond_0

    array-length v0, v4

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    .line 198
    const/4 v0, 0x0

    aget-object v0, v4, v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    aget-object v1, v4, v1

    check-cast v1, [Lorg/apache/http/Header;

    check-cast v1, [Lorg/apache/http/Header;

    const/4 v2, 0x2

    aget-object v2, v4, v2

    check-cast v2, [B

    check-cast v2, [B

    invoke-virtual {p0, v0, v1, v2}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->onSuccess(I[Lorg/apache/http/Header;[B)V

    goto/16 :goto_0

    .line 200
    :cond_0
    const-string v0, "AsyncHttpResponseHandler"

    const-string v1, "SUCCESS_MESSAGE didn\'t got enough params"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    goto/16 :goto_0

    .line 204
    :pswitch_1
    const-string v0, "AsyncHttpResponseHandler"

    const-string v1, "handlerMessage FALIURE_MESSAGE"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 205
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, [Ljava/lang/Object;

    .line 206
    if-eqz v4, :cond_1

    array-length v0, v4

    const/4 v1, 0x4

    if-lt v0, v1, :cond_1

    .line 207
    const/4 v0, 0x0

    aget-object v0, v4, v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    aget-object v1, v4, v1

    check-cast v1, [Lorg/apache/http/Header;

    check-cast v1, [Lorg/apache/http/Header;

    const/4 v2, 0x2

    aget-object v2, v4, v2

    check-cast v2, [B

    check-cast v2, [B

    const/4 v3, 0x3

    aget-object v3, v4, v3

    check-cast v3, Ljava/lang/Throwable;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->onFailure(I[Lorg/apache/http/Header;[BLjava/lang/Throwable;)V

    goto :goto_0

    .line 209
    :cond_1
    const-string v0, "AsyncHttpResponseHandler"

    const-string v1, "FAILURE_MESSAGE didn\'t got enough params"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    goto :goto_0

    .line 213
    :pswitch_2
    const-string v0, "AsyncHttpResponseHandler"

    const-string v1, "handlerMessage START_MESSAGE"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->onStart()V

    .line 215
    goto :goto_0

    .line 217
    :pswitch_3
    const-string v0, "AsyncHttpResponseHandler"

    const-string v1, "handlerMessage FINISH_MESSAGE"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 218
    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->onFinish()V

    .line 219
    goto :goto_0

    .line 221
    :pswitch_4
    const-string v0, "AsyncHttpResponseHandler"

    const-string v1, "handlerMessage PROGRESS_MESSAGE"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 222
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, [Ljava/lang/Object;

    .line 223
    if-eqz v4, :cond_2

    array-length v0, v4

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    .line 224
    const/4 v0, 0x0

    aget-object v0, v4, v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    aget-object v1, v4, v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->onProgress(II)V

    goto :goto_0

    .line 226
    :cond_2
    const-string v0, "AsyncHttpResponseHandler"

    const-string v1, "PROGRESS_MESSAGE didn\'t got enough params"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    goto :goto_0

    .line 230
    :pswitch_5
    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->onCancel()V

    .line 233
    :goto_0
    :pswitch_6
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

.method public onCancel()V
    .locals 0

    .line 329
    return-void
.end method

.method public abstract onFailure(I[Lorg/apache/http/Header;[BLjava/lang/Throwable;)V
.end method

.method public onFinish()V
    .locals 0

    .line 322
    return-void
.end method

.method public onProgress(II)V
    .locals 0

    .line 308
    return-void
.end method

.method public onStart()V
    .locals 0

    .line 315
    return-void
.end method

.method public abstract onSuccess(I[Lorg/apache/http/Header;[B)V
.end method

.method public sendCancelMessage()V
    .locals 2

    .line 154
    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->sendMessage(Landroid/os/Message;)V

    .line 155
    return-void
.end method

.method public sendFailureMessage(I[Lorg/apache/http/Header;[BLjava/lang/Throwable;)V
    .locals 3

    .line 164
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p2, v0, v1

    const/4 v1, 0x2

    aput-object p3, v0, v1

    const/4 v1, 0x3

    aput-object p4, v0, v1

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->sendMessage(Landroid/os/Message;)V

    .line 165
    return-void
.end method

.method public sendFinishMessage()V
    .locals 2

    .line 144
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->sendMessage(Landroid/os/Message;)V

    .line 145
    return-void
.end method

.method public sendProgressMessage(II)V
    .locals 3

    .line 149
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x4

    invoke-direct {p0, v1, v0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->sendMessage(Landroid/os/Message;)V

    .line 150
    return-void
.end method

.method public sendResponseMessage(Lorg/apache/http/HttpResponse;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 121
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_2

    .line 122
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v5

    .line 123
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->getResponseData(Lorg/apache/http/HttpEntity;)[B

    move-result-object v6

    .line 124
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_2

    .line 125
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 126
    const-string v0, "AysncHttpClient"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "==>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v5}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "=="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    new-instance v2, Ljava/lang/String;

    const-string v3, "utf-8"

    invoke-direct {v2, v6, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    :cond_0
    invoke-interface {v5}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v0

    const/16 v1, 0x12c

    if-le v0, v1, :cond_1

    .line 129
    invoke-interface {v5}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v0

    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v1

    new-instance v2, Lorg/apache/http/client/HttpResponseException;

    invoke-interface {v5}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v3

    invoke-interface {v5}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lorg/apache/http/client/HttpResponseException;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v0, v1, v6, v2}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->sendFailureMessage(I[Lorg/apache/http/Header;[BLjava/lang/Throwable;)V

    goto :goto_0

    .line 131
    :cond_1
    invoke-interface {v5}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v0

    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v1

    invoke-virtual {p0, v0, v1, v6}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->sendSuccessMessage(I[Lorg/apache/http/Header;[B)V

    .line 135
    :cond_2
    :goto_0
    return-void
.end method

.method public sendRetryMessage(I)V
    .locals 3

    .line 169
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x5

    invoke-direct {p0, v1, v0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->sendMessage(Landroid/os/Message;)V

    .line 170
    return-void
.end method

.method public sendStartMessage()V
    .locals 2

    .line 139
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->sendMessage(Landroid/os/Message;)V

    .line 140
    return-void
.end method

.method public sendSuccessMessage(I[Lorg/apache/http/Header;[B)V
    .locals 3

    .line 159
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p2, v0, v1

    const/4 v1, 0x2

    aput-object p3, v0, v1

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->sendMessage(Landroid/os/Message;)V

    .line 160
    return-void
.end method

.method public setCharset(Ljava/lang/String;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->responseCharset:Ljava/lang/String;

    .line 108
    return-void
.end method

.method public setRequestHeaders([Lorg/apache/http/Header;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->requestHeaders:[Lorg/apache/http/Header;

    .line 66
    return-void
.end method

.method public setRequestURI(Ljava/net/URI;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->requestURI:Ljava/net/URI;

    .line 56
    return-void
.end method

.method public setUseSynchronousMode(Z)V
    .locals 1

    .line 70
    if-nez p1, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_0

    .line 71
    const/4 p1, 0x1

    .line 73
    :cond_0
    if-nez p1, :cond_1

    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->handler:Landroid/os/Handler;

    if-nez v0, :cond_1

    .line 74
    new-instance v0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler$ResponderHandler;

    invoke-direct {v0, p0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler$ResponderHandler;-><init>(Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;)V

    iput-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->handler:Landroid/os/Handler;

    goto :goto_0

    .line 75
    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->handler:Landroid/os/Handler;

    if-eqz v0, :cond_2

    .line 76
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->handler:Landroid/os/Handler;

    .line 79
    :cond_2
    :goto_0
    iput-boolean p1, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;->useSynchronousMode:Z

    .line 80
    return-void
.end method
