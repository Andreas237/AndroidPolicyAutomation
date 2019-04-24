.class Lcom/tencent/stat/d;
.super Ljava/lang/Object;


# static fields
.field private static c:Lcom/tencent/stat/common/StatLogger;

.field private static d:J

.field private static e:Lcom/tencent/stat/d;

.field private static f:Landroid/content/Context;


# instance fields
.field a:Lorg/apache/http/impl/client/DefaultHttpClient;

.field b:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/tencent/stat/common/k;->b()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    sput-object v0, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;

    const-wide/16 v0, -0x1

    sput-wide v0, Lcom/tencent/stat/d;->d:J

    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/stat/d;->e:Lcom/tencent/stat/d;

    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/stat/d;->f:Landroid/content/Context;

    return-void
.end method

.method private constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/stat/d;->a:Lorg/apache/http/impl/client/DefaultHttpClient;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/stat/d;->b:Landroid/os/Handler;

    :try_start_0
    new-instance v3, Landroid/os/HandlerThread;

    const-string v0, "StatDispatcher"

    invoke-direct {v3, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/os/HandlerThread;->start()V

    invoke-virtual {v3}, Landroid/os/HandlerThread;->getId()J

    move-result-wide v0

    sput-wide v0, Lcom/tencent/stat/d;->d:J

    new-instance v0, Landroid/os/Handler;

    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/tencent/stat/d;->b:Landroid/os/Handler;

    new-instance v4, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v4}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    const/16 v0, 0x2710

    invoke-static {v4, v0}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    const/16 v0, 0x2710

    invoke-static {v4, v0}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v0, v4}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V

    iput-object v0, p0, Lcom/tencent/stat/d;->a:Lorg/apache/http/impl/client/DefaultHttpClient;

    iget-object v0, p0, Lcom/tencent/stat/d;->a:Lorg/apache/http/impl/client/DefaultHttpClient;

    new-instance v1, Lcom/tencent/stat/e;

    invoke-direct {v1, p0}, Lcom/tencent/stat/e;-><init>(Lcom/tencent/stat/d;)V

    invoke-virtual {v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->setKeepAliveStrategy(Lorg/apache/http/conn/ConnectionKeepAliveStrategy;)V

    invoke-static {}, Lcom/tencent/stat/StatConfig;->b()Lorg/apache/http/HttpHost;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/stat/d;->a:Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.route.default-proxy"

    invoke-static {}, Lcom/tencent/stat/StatConfig;->b()Lorg/apache/http/HttpHost;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    goto :goto_0

    :catch_0
    move-exception v3

    sget-object v0, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method static a()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/tencent/stat/d;->f:Landroid/content/Context;

    return-object v0
.end method

.method static a(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/tencent/stat/d;->f:Landroid/content/Context;

    return-void
.end method

.method static declared-synchronized b()Lcom/tencent/stat/d;
    .locals 4

    const-class v2, Lcom/tencent/stat/d;

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/tencent/stat/d;->e:Lcom/tencent/stat/d;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    new-instance v0, Lcom/tencent/stat/d;

    invoke-direct {v0}, Lcom/tencent/stat/d;-><init>()V

    sput-object v0, Lcom/tencent/stat/d;->e:Lcom/tencent/stat/d;

    :cond_0
    sget-object v0, Lcom/tencent/stat/d;->e:Lcom/tencent/stat/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method static synthetic c()Lcom/tencent/stat/common/StatLogger;
    .locals 1

    sget-object v0, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;

    return-object v0
.end method


# virtual methods
.method a(Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/tencent/stat/a/e;->d()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/tencent/stat/d;->b(Ljava/util/List;Lcom/tencent/stat/c;)V

    return-void
.end method

.method a(Ljava/util/List;Lcom/tencent/stat/c;)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Lcom/tencent/stat/c;)V"
        }
    .end annotation

    :try_start_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "["

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v6, 0x0

    :goto_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    move-object/from16 v0, p1

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq v6, v0, :cond_0

    const-string v0, ","

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    const-string v0, "]"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/tencent/stat/StatConfig;->getStatReportUrl()Ljava/lang/String;

    move-result-object v6

    sget-object v0, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]Send request("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "bytes):"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->i(Ljava/lang/Object;)V

    new-instance v7, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v7, v6}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    const-string v0, "Accept-Encoding"

    const-string v1, "gzip"

    invoke-virtual {v7, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Connection"

    const-string v1, "Keep-Alive"

    invoke-virtual {v7, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Cache-Control"

    invoke-virtual {v7, v0}, Lorg/apache/http/client/methods/HttpPost;->removeHeaders(Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/stat/d;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/stat/common/k;->a(Landroid/content/Context;)Lorg/apache/http/HttpHost;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v0, 0x0

    if-eq v0, v9, :cond_2

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/stat/d;->a:Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.route.default-proxy"

    sget-object v2, Lcom/tencent/stat/d;->f:Landroid/content/Context;

    invoke-static {v2}, Lcom/tencent/stat/common/k;->a(Landroid/content/Context;)Lorg/apache/http/HttpHost;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    const-string v0, "X-Online-Host"

    const-string v1, "pingma.qq.com:80"

    invoke-virtual {v7, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Accept"

    const-string v1, "*/*"

    invoke-virtual {v7, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Content-Type"

    const-string v1, "json"

    invoke-virtual {v7, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v10, 0x1

    :cond_2
    new-instance v11, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v11}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v12

    array-length v13, v12

    move-object v14, v12

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/16 v1, 0x100

    if-ge v0, v1, :cond_4

    if-nez v9, :cond_3

    const-string v0, "Content-Encoding"

    const-string v1, "rc4"

    invoke-virtual {v7, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_3
    const-string v0, "X-Content-Encoding"

    const-string v1, "rc4"

    invoke-virtual {v7, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    if-nez v9, :cond_5

    const-string v0, "Content-Encoding"

    const-string v1, "rc4,gzip"

    invoke-virtual {v7, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    const-string v0, "X-Content-Encoding"

    const-string v1, "rc4,gzip"

    invoke-virtual {v7, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    const/4 v0, 0x4

    new-array v0, v0, [B

    invoke-virtual {v11, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    new-instance v0, Ljava/util/zip/GZIPOutputStream;

    move-object v1, v11

    invoke-direct {v0, v1}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v15, v0

    invoke-virtual {v15, v14}, Ljava/util/zip/GZIPOutputStream;->write([B)V

    invoke-virtual {v15}, Ljava/util/zip/GZIPOutputStream;->close()V

    invoke-virtual {v11}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v14

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {v14, v0, v1}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-virtual {v0, v13}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    sget-object v0, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "before Gzip:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " bytes, after Gzip:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, v14

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " bytes"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V

    :goto_2
    invoke-static {v14}, Lcom/tencent/stat/common/e;->a([B)[B

    move-result-object v14

    new-instance v8, Lorg/apache/http/entity/ByteArrayEntity;

    invoke-direct {v8, v14}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    invoke-virtual {v7, v8}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/stat/d;->a:Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-virtual {v0, v7}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v15

    if-eqz v10, :cond_6

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/stat/d;->a:Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.route.default-proxy"

    invoke-interface {v0, v1}, Lorg/apache/http/params/HttpParams;->removeParameter(Ljava/lang/String;)Z

    :cond_6
    invoke-interface {v15}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v16

    invoke-interface {v15}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v17

    invoke-interface/range {v16 .. v16}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v18

    sget-object v0, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "recv response status code:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, v17

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", content length:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-wide/from16 v2, v18

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->i(Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    cmp-long v0, v18, v0

    if-nez v0, :cond_8

    invoke-static/range {v16 .. v16}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;

    move/from16 v0, v17

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_7

    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_12

    invoke-interface/range {p2 .. p2}, Lcom/tencent/stat/c;->a()V

    goto/16 :goto_8

    :cond_7
    sget-object v0, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Server response error code:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, v17

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_8
    const-wide/16 v0, 0x0

    cmp-long v0, v18, v0

    if-lez v0, :cond_11

    invoke-interface/range {v16 .. v16}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v20

    new-instance v0, Ljava/io/DataInputStream;

    move-object/from16 v1, v20

    invoke-direct {v0, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    move-object/from16 v21, v0

    invoke-interface/range {v16 .. v16}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v0

    long-to-int v0, v0

    new-array v1, v0, [B

    move-object/from16 v22, v1

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/io/DataInputStream;->readFully([B)V

    invoke-virtual/range {v20 .. v20}, Ljava/io/InputStream;->close()V

    invoke-virtual/range {v21 .. v21}, Ljava/io/DataInputStream;->close()V

    const-string v0, "Content-Encoding"

    invoke-interface {v15, v0}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v23

    if-eqz v23, :cond_c

    invoke-interface/range {v23 .. v23}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gzip,rc4"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static/range {v22 .. v22}, Lcom/tencent/stat/common/k;->a([B)[B

    move-result-object v22

    invoke-static/range {v22 .. v22}, Lcom/tencent/stat/common/e;->b([B)[B

    move-result-object v22

    goto :goto_3

    :cond_9
    invoke-interface/range {v23 .. v23}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rc4,gzip"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static/range {v22 .. v22}, Lcom/tencent/stat/common/e;->b([B)[B

    move-result-object v22

    invoke-static/range {v22 .. v22}, Lcom/tencent/stat/common/k;->a([B)[B

    move-result-object v22

    goto :goto_3

    :cond_a
    invoke-interface/range {v23 .. v23}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gzip"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static/range {v22 .. v22}, Lcom/tencent/stat/common/k;->a([B)[B

    move-result-object v22

    goto :goto_3

    :cond_b
    invoke-interface/range {v23 .. v23}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rc4"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static/range {v22 .. v22}, Lcom/tencent/stat/common/e;->b([B)[B
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v22

    :cond_c
    :goto_3
    move/from16 v0, v17

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_f

    :try_start_1
    new-instance v0, Ljava/lang/String;

    move-object/from16 v1, v22

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    move-object/from16 v24, v0

    sget-object v0, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V

    new-instance v0, Lorg/json/JSONObject;

    move-object/from16 v1, v24

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object/from16 v25, v0

    const-string v0, "cfg"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_d

    const-string v0, "cfg"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v26

    invoke-static/range {v26 .. v26}, Lcom/tencent/stat/StatConfig;->a(Lorg/json/JSONObject;)V

    :cond_d
    const-string v0, "et"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    const-string v0, "st"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    sget-object v0, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get mid respone:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, v24

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V

    const-string v0, "et"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v26

    sget-object v0, Lcom/tencent/stat/a/f;->b:Lcom/tencent/stat/a/f;

    invoke-virtual {v0}, Lcom/tencent/stat/a/f;->a()I

    move-result v0

    move/from16 v1, v26

    if-ne v1, v0, :cond_e

    const-string v0, "st"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v27

    sparse-switch v27, :sswitch_data_0

    goto :goto_4

    :sswitch_0
    const-string v0, "mid"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    sget-object v0, Lcom/tencent/stat/d;->f:Landroid/content/Context;

    const-string v1, "mid"

    move-object/from16 v2, v25

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/stat/StatMid;->updateDeviceInfo(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_5

    :goto_4
    sget-object v0, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "error type for st:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, v27

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_e
    :goto_5
    goto :goto_6

    :catch_0
    move-exception v24

    :try_start_2
    sget-object v0, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->i(Ljava/lang/Object;)V

    :goto_6
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_10

    invoke-interface/range {p2 .. p2}, Lcom/tencent/stat/c;->a()V

    goto :goto_7

    :cond_f
    sget-object v0, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Server response error code:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, v17

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", error:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    new-instance v2, Ljava/lang/String;

    const-string v3, "UTF-8"

    move-object/from16 v4, v22

    invoke-direct {v2, v4, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    :cond_10
    :goto_7
    invoke-virtual/range {v20 .. v20}, Ljava/io/InputStream;->close()V

    goto :goto_8

    :cond_11
    invoke-static/range {v16 .. v16}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;

    :cond_12
    :goto_8
    invoke-virtual {v11}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_a

    :catch_1
    move-exception v5

    :try_start_3
    sget-object v0, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v5}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_13

    :try_start_4
    invoke-interface/range {p2 .. p2}, Lcom/tencent/stat/c;->b()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_9

    :catch_2
    move-exception v6

    :try_start_5
    sget-object v0, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v6}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_13
    :goto_9
    goto :goto_a

    :catchall_0
    move-exception v28

    throw v28

    :goto_a
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x1 -> :sswitch_0
        0x0 -> :sswitch_0
    .end sparse-switch
.end method

.method b(Ljava/util/List;Lcom/tencent/stat/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Lcom/tencent/stat/c;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/tencent/stat/d;->b:Landroid/os/Handler;

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/tencent/stat/d;->b:Landroid/os/Handler;

    new-instance v1, Lcom/tencent/stat/f;

    invoke-direct {v1, p0, p1, p2}, Lcom/tencent/stat/f;-><init>(Lcom/tencent/stat/d;Ljava/util/List;Lcom/tencent/stat/c;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
