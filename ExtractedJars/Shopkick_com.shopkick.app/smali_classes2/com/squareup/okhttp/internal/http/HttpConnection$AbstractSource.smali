.class Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;
.super Ljava/lang/Object;
.source "HttpConnection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/http/HttpConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AbstractSource"
.end annotation


# instance fields
.field protected final cacheBody:Lokio/Sink;

.field private final cacheRequest:Lcom/squareup/okhttp/internal/http/CacheRequest;

.field protected closed:Z

.field final synthetic this$0:Lcom/squareup/okhttp/internal/http/HttpConnection;


# direct methods
.method constructor <init>(Lcom/squareup/okhttp/internal/http/HttpConnection;Lcom/squareup/okhttp/internal/http/CacheRequest;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 377
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->this$0:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    .line 379
    invoke-interface {p2}, Lcom/squareup/okhttp/internal/http/CacheRequest;->body()Lokio/Sink;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p1, p2

    .line 384
    :goto_1
    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->cacheBody:Lokio/Sink;

    .line 385
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->cacheRequest:Lcom/squareup/okhttp/internal/http/CacheRequest;

    return-void
.end method


# virtual methods
.method protected final cacheWrite(Lokio/Buffer;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 390
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->cacheBody:Lokio/Sink;

    if-eqz v0, :cond_0

    .line 392
    invoke-virtual {p1}, Lokio/Buffer;->clone()Lokio/Buffer;

    move-result-object p1

    .line 393
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    move-result-wide v0

    sub-long/2addr v0, p2

    invoke-virtual {p1, v0, v1}, Lokio/Buffer;->skip(J)V

    .line 394
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->cacheBody:Lokio/Sink;

    invoke-interface {v0, p1, p2, p3}, Lokio/Sink;->write(Lokio/Buffer;J)V

    :cond_0
    return-void
.end method

.method protected final endOfInput(Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 403
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->this$0:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/HttpConnection;->access$300(Lcom/squareup/okhttp/internal/http/HttpConnection;)I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_3

    .line 405
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->cacheRequest:Lcom/squareup/okhttp/internal/http/CacheRequest;

    if-eqz v0, :cond_0

    .line 406
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->cacheBody:Lokio/Sink;

    invoke-interface {v0}, Lokio/Sink;->close()V

    .line 409
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->this$0:Lcom/squareup/okhttp/internal/http/HttpConnection;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/squareup/okhttp/internal/http/HttpConnection;->access$302(Lcom/squareup/okhttp/internal/http/HttpConnection;I)I

    if-eqz p1, :cond_1

    .line 410
    iget-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->this$0:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-static {p1}, Lcom/squareup/okhttp/internal/http/HttpConnection;->access$600(Lcom/squareup/okhttp/internal/http/HttpConnection;)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 411
    iget-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->this$0:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-static {p1, v1}, Lcom/squareup/okhttp/internal/http/HttpConnection;->access$602(Lcom/squareup/okhttp/internal/http/HttpConnection;I)I

    .line 412
    sget-object p1, Lcom/squareup/okhttp/internal/Internal;->instance:Lcom/squareup/okhttp/internal/Internal;

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->this$0:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/HttpConnection;->access$700(Lcom/squareup/okhttp/internal/http/HttpConnection;)Lcom/squareup/okhttp/ConnectionPool;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->this$0:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-static {v1}, Lcom/squareup/okhttp/internal/http/HttpConnection;->access$800(Lcom/squareup/okhttp/internal/http/HttpConnection;)Lcom/squareup/okhttp/Connection;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/squareup/okhttp/internal/Internal;->recycle(Lcom/squareup/okhttp/ConnectionPool;Lcom/squareup/okhttp/Connection;)V

    goto :goto_0

    .line 413
    :cond_1
    iget-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->this$0:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-static {p1}, Lcom/squareup/okhttp/internal/http/HttpConnection;->access$600(Lcom/squareup/okhttp/internal/http/HttpConnection;)I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    .line 414
    iget-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->this$0:Lcom/squareup/okhttp/internal/http/HttpConnection;

    const/4 v0, 0x6

    invoke-static {p1, v0}, Lcom/squareup/okhttp/internal/http/HttpConnection;->access$302(Lcom/squareup/okhttp/internal/http/HttpConnection;I)I

    .line 415
    iget-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->this$0:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-static {p1}, Lcom/squareup/okhttp/internal/http/HttpConnection;->access$800(Lcom/squareup/okhttp/internal/http/HttpConnection;)Lcom/squareup/okhttp/Connection;

    move-result-object p1

    invoke-virtual {p1}, Lcom/squareup/okhttp/Connection;->getSocket()Ljava/net/Socket;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/Socket;->close()V

    :cond_2
    :goto_0
    return-void

    .line 403
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->this$0:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-static {v1}, Lcom/squareup/okhttp/internal/http/HttpConnection;->access$300(Lcom/squareup/okhttp/internal/http/HttpConnection;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected final unexpectedEndOfInput()V
    .locals 2

    .line 432
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->cacheRequest:Lcom/squareup/okhttp/internal/http/CacheRequest;

    if-eqz v0, :cond_0

    .line 433
    invoke-interface {v0}, Lcom/squareup/okhttp/internal/http/CacheRequest;->abort()V

    .line 435
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->this$0:Lcom/squareup/okhttp/internal/http/HttpConnection;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/HttpConnection;->access$800(Lcom/squareup/okhttp/internal/http/HttpConnection;)Lcom/squareup/okhttp/Connection;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Connection;->getSocket()Ljava/net/Socket;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/net/Socket;)V

    .line 436
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpConnection$AbstractSource;->this$0:Lcom/squareup/okhttp/internal/http/HttpConnection;

    const/4 v1, 0x6

    invoke-static {v0, v1}, Lcom/squareup/okhttp/internal/http/HttpConnection;->access$302(Lcom/squareup/okhttp/internal/http/HttpConnection;I)I

    return-void
.end method
