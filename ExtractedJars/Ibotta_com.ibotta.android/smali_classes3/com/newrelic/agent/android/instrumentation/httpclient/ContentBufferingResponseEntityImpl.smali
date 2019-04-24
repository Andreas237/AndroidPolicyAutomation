.class public Lcom/newrelic/agent/android/instrumentation/httpclient/ContentBufferingResponseEntityImpl;
.super Ljava/lang/Object;
.source "ContentBufferingResponseEntityImpl.java"

# interfaces
.implements Lorg/apache/http/HttpEntity;


# instance fields
.field private contentStream:Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

.field final impl:Lorg/apache/http/HttpEntity;


# direct methods
.method public constructor <init>(Lorg/apache/http/HttpEntity;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 20
    iput-object p1, p0, Lcom/newrelic/agent/android/instrumentation/httpclient/ContentBufferingResponseEntityImpl;->impl:Lorg/apache/http/HttpEntity;

    return-void

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Missing wrapped entity"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public consumeContent()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/httpclient/ContentBufferingResponseEntityImpl;->impl:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->consumeContent()V

    return-void
.end method

.method public getContent()Ljava/io/InputStream;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/httpclient/ContentBufferingResponseEntityImpl;->contentStream:Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    if-eqz v0, :cond_0

    return-object v0

    .line 33
    :cond_0
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/httpclient/ContentBufferingResponseEntityImpl;->impl:Lorg/apache/http/HttpEntity;

    invoke-interface {v1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;-><init>(Ljava/io/InputStream;Z)V

    iput-object v0, p0, Lcom/newrelic/agent/android/instrumentation/httpclient/ContentBufferingResponseEntityImpl;->contentStream:Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    .line 34
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/httpclient/ContentBufferingResponseEntityImpl;->contentStream:Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    return-object v0
.end method

.method public getContentEncoding()Lorg/apache/http/Header;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/httpclient/ContentBufferingResponseEntityImpl;->impl:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentEncoding()Lorg/apache/http/Header;

    move-result-object v0

    return-object v0
.end method

.method public getContentLength()J
    .locals 2

    .line 44
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/httpclient/ContentBufferingResponseEntityImpl;->impl:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v0

    return-wide v0
.end method

.method public getContentType()Lorg/apache/http/Header;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/httpclient/ContentBufferingResponseEntityImpl;->impl:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentType()Lorg/apache/http/Header;

    move-result-object v0

    return-object v0
.end method

.method public isChunked()Z
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/httpclient/ContentBufferingResponseEntityImpl;->impl:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->isChunked()Z

    move-result v0

    return v0
.end method

.method public isRepeatable()Z
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/httpclient/ContentBufferingResponseEntityImpl;->impl:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->isRepeatable()Z

    move-result v0

    return v0
.end method

.method public isStreaming()Z
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/httpclient/ContentBufferingResponseEntityImpl;->impl:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->isStreaming()Z

    move-result v0

    return v0
.end method

.method public writeTo(Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 69
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/httpclient/ContentBufferingResponseEntityImpl;->impl:Lorg/apache/http/HttpEntity;

    invoke-interface {v0, p1}, Lorg/apache/http/HttpEntity;->writeTo(Ljava/io/OutputStream;)V

    return-void
.end method
