.class Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor$Chain;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http/HttpEngine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "NetworkInterceptorChain"
.end annotation


# instance fields
.field private calls:I

.field private final index:I

.field private final request:Lokhttp3/Request;

.field final synthetic this$0:Lokhttp3/internal/http/HttpEngine;


# direct methods
.method constructor <init>(Lokhttp3/internal/http/HttpEngine;ILokhttp3/Request;)V
    .locals 0

    .line 643
    iput-object p1, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lokhttp3/internal/http/HttpEngine;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 644
    iput p2, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->index:I

    .line 645
    iput-object p3, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->request:Lokhttp3/Request;

    .line 646
    return-void
.end method


# virtual methods
.method public connection()Lokhttp3/Connection;
    .locals 1

    .line 649
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lokhttp3/internal/http/HttpEngine;

    iget-object v0, v0, Lokhttp3/internal/http/HttpEngine;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    invoke-virtual {v0}, Lokhttp3/internal/http/StreamAllocation;->connection()Lokhttp3/internal/io/RealConnection;

    move-result-object v0

    return-object v0
.end method

.method public proceed(Lokhttp3/Request;)Lokhttp3/Response;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 657
    iget v0, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->calls:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->calls:I

    .line 659
    iget v0, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->index:I

    if-lez v0, :cond_2

    .line 660
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lokhttp3/internal/http/HttpEngine;

    iget-object v0, v0, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->networkInterceptors()Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->index:I

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lokhttp3/Interceptor;

    .line 661
    invoke-virtual {p0}, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->connection()Lokhttp3/Connection;

    move-result-object v0

    invoke-interface {v0}, Lokhttp3/Connection;->route()Lokhttp3/Route;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Route;->address()Lokhttp3/Address;

    move-result-object v5

    .line 664
    invoke-virtual {p1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Lokhttp3/Address;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 665
    invoke-virtual {p1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/HttpUrl;->port()I

    move-result v0

    invoke-virtual {v5}, Lokhttp3/Address;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/HttpUrl;->port()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 666
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "network interceptor "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " must retain the same host and port"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 671
    :cond_1
    iget v0, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->calls:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    .line 672
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "network interceptor "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " must call proceed() exactly once"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 677
    :cond_2
    iget v0, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->index:I

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lokhttp3/internal/http/HttpEngine;

    iget-object v1, v1, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v1}, Lokhttp3/OkHttpClient;->networkInterceptors()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 679
    new-instance v4, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;

    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lokhttp3/internal/http/HttpEngine;

    iget v1, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->index:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v4, v0, v1, p1}, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;-><init>(Lokhttp3/internal/http/HttpEngine;ILokhttp3/Request;)V

    .line 680
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lokhttp3/internal/http/HttpEngine;

    iget-object v0, v0, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->networkInterceptors()Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->index:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lokhttp3/Interceptor;

    .line 681
    invoke-interface {v5, v4}, Lokhttp3/Interceptor;->intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;

    move-result-object v6

    .line 684
    iget v0, v4, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->calls:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    .line 685
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "network interceptor "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " must call proceed() exactly once"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 688
    :cond_3
    if-nez v6, :cond_4

    .line 689
    new-instance v0, Ljava/lang/NullPointerException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "network interceptor "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " returned null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 693
    :cond_4
    return-object v6

    .line 696
    :cond_5
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lokhttp3/internal/http/HttpEngine;

    invoke-static {v0}, Lokhttp3/internal/http/HttpEngine;->access$000(Lokhttp3/internal/http/HttpEngine;)Lokhttp3/internal/http/HttpStream;

    move-result-object v0

    invoke-interface {v0, p1}, Lokhttp3/internal/http/HttpStream;->writeRequestHeaders(Lokhttp3/Request;)V

    .line 699
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lokhttp3/internal/http/HttpEngine;

    invoke-static {v0, p1}, Lokhttp3/internal/http/HttpEngine;->access$102(Lokhttp3/internal/http/HttpEngine;Lokhttp3/Request;)Lokhttp3/Request;

    .line 701
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lokhttp3/internal/http/HttpEngine;

    invoke-virtual {v0, p1}, Lokhttp3/internal/http/HttpEngine;->permitsRequestBody(Lokhttp3/Request;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lokhttp3/Request;->body()Lokhttp3/RequestBody;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 702
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lokhttp3/internal/http/HttpEngine;

    invoke-static {v0}, Lokhttp3/internal/http/HttpEngine;->access$000(Lokhttp3/internal/http/HttpEngine;)Lokhttp3/internal/http/HttpStream;

    move-result-object v0

    invoke-virtual {p1}, Lokhttp3/Request;->body()Lokhttp3/RequestBody;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/RequestBody;->contentLength()J

    move-result-wide v1

    invoke-interface {v0, p1, v1, v2}, Lokhttp3/internal/http/HttpStream;->createRequestBody(Lokhttp3/Request;J)Lokio/Sink;

    move-result-object v4

    .line 703
    invoke-static {v4}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object v5

    .line 704
    invoke-virtual {p1}, Lokhttp3/Request;->body()Lokhttp3/RequestBody;

    move-result-object v0

    invoke-virtual {v0, v5}, Lokhttp3/RequestBody;->writeTo(Lokio/BufferedSink;)V

    .line 705
    invoke-interface {v5}, Lokio/BufferedSink;->close()V

    .line 708
    :cond_6
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->this$0:Lokhttp3/internal/http/HttpEngine;

    invoke-static {v0}, Lokhttp3/internal/http/HttpEngine;->access$200(Lokhttp3/internal/http/HttpEngine;)Lokhttp3/Response;

    move-result-object v4

    .line 710
    invoke-virtual {v4}, Lokhttp3/Response;->code()I

    move-result v5

    .line 711
    const/16 v0, 0xcc

    if-eq v5, v0, :cond_7

    const/16 v0, 0xcd

    if-ne v5, v0, :cond_8

    :cond_7
    invoke-virtual {v4}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_8

    .line 712
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HTTP "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " had non-zero Content-Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 713
    invoke-virtual {v4}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 716
    :cond_8
    return-object v4
.end method

.method public request()Lokhttp3/Request;
    .locals 1

    .line 653
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$NetworkInterceptorChain;->request:Lokhttp3/Request;

    return-object v0
.end method
