.class final Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;
.super Ljava/lang/Object;
.source "Http1xStream.java"

# interfaces
.implements Lokio/Sink;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/http/Http1xStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "FixedLengthSink"
.end annotation


# instance fields
.field private bytesRemaining:J

.field private closed:Z

.field final synthetic this$0:Lcom/squareup/okhttp/internal/http/Http1xStream;

.field private final timeout:Lokio/ForwardingTimeout;


# direct methods
.method private constructor <init>(Lcom/squareup/okhttp/internal/http/Http1xStream;J)V
    .locals 1

    .line 273
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;->this$0:Lcom/squareup/okhttp/internal/http/Http1xStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 269
    new-instance p1, Lokio/ForwardingTimeout;

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;->this$0:Lcom/squareup/okhttp/internal/http/Http1xStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/Http1xStream;->access$300(Lcom/squareup/okhttp/internal/http/Http1xStream;)Lokio/BufferedSink;

    move-result-object v0

    invoke-interface {v0}, Lokio/BufferedSink;->timeout()Lokio/Timeout;

    move-result-object v0

    invoke-direct {p1, v0}, Lokio/ForwardingTimeout;-><init>(Lokio/Timeout;)V

    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;->timeout:Lokio/ForwardingTimeout;

    .line 274
    iput-wide p2, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;->bytesRemaining:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/squareup/okhttp/internal/http/Http1xStream;JLcom/squareup/okhttp/internal/http/Http1xStream$1;)V
    .locals 0

    .line 268
    invoke-direct {p0, p1, p2, p3}, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;-><init>(Lcom/squareup/okhttp/internal/http/Http1xStream;J)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 298
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;->closed:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 299
    iput-boolean v0, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;->closed:Z

    .line 300
    iget-wide v0, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;->bytesRemaining:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    .line 301
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;->this$0:Lcom/squareup/okhttp/internal/http/Http1xStream;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;->timeout:Lokio/ForwardingTimeout;

    invoke-static {v0, v1}, Lcom/squareup/okhttp/internal/http/Http1xStream;->access$400(Lcom/squareup/okhttp/internal/http/Http1xStream;Lokio/ForwardingTimeout;)V

    .line 302
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;->this$0:Lcom/squareup/okhttp/internal/http/Http1xStream;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/squareup/okhttp/internal/http/Http1xStream;->access$502(Lcom/squareup/okhttp/internal/http/Http1xStream;I)I

    return-void

    .line 300
    :cond_1
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "unexpected end of stream"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 293
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;->closed:Z

    if-eqz v0, :cond_0

    return-void

    .line 294
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;->this$0:Lcom/squareup/okhttp/internal/http/Http1xStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/Http1xStream;->access$300(Lcom/squareup/okhttp/internal/http/Http1xStream;)Lokio/BufferedSink;

    move-result-object v0

    invoke-interface {v0}, Lokio/BufferedSink;->flush()V

    return-void
.end method

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 278
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;->timeout:Lokio/ForwardingTimeout;

    return-object v0
.end method

.method public write(Lokio/Buffer;J)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 282
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;->closed:Z

    if-nez v0, :cond_1

    .line 283
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Lcom/squareup/okhttp/internal/Util;->checkOffsetAndCount(JJJ)V

    .line 284
    iget-wide v0, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;->bytesRemaining:J

    cmp-long v2, p2, v0

    if-gtz v2, :cond_0

    .line 288
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;->this$0:Lcom/squareup/okhttp/internal/http/Http1xStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/Http1xStream;->access$300(Lcom/squareup/okhttp/internal/http/Http1xStream;)Lokio/BufferedSink;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lokio/BufferedSink;->write(Lokio/Buffer;J)V

    .line 289
    iget-wide v0, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;->bytesRemaining:J

    sub-long/2addr v0, p2

    iput-wide v0, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;->bytesRemaining:J

    return-void

    .line 285
    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "expected "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/squareup/okhttp/internal/http/Http1xStream$FixedLengthSink;->bytesRemaining:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " bytes but received "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 282
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
