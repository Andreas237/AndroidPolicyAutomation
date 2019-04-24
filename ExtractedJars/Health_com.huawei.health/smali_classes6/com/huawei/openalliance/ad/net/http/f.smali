.class Lcom/huawei/openalliance/ad/net/http/f;
.super Lcom/huawei/openalliance/ad/net/http/b;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/net/http/b;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;ZLcom/huawei/openalliance/ad/net/http/c;Lcom/huawei/openalliance/ad/net/http/d;)Ljava/net/HttpURLConnection;
    .locals 7

    const-string v0, "HttpUrlConnectionCaller"

    const-string v1, "createConnection: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/ad;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v5, Ljava/net/URL;

    invoke-direct {v5, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/net/HttpURLConnection;

    invoke-static {v6}, Lcom/huawei/openalliance/ad/net/http/HttpsConfig;->a(Ljava/net/HttpURLConnection;)V

    invoke-virtual {v6, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    iget v0, p5, Lcom/huawei/openalliance/ad/net/http/d;->b:I

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    iget v0, p5, Lcom/huawei/openalliance/ad/net/http/d;->c:I

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    invoke-virtual {v6, p3}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    invoke-direct {p0, v6, p4}, Lcom/huawei/openalliance/ad/net/http/f;->a(Ljava/net/HttpURLConnection;Lcom/huawei/openalliance/ad/net/http/c;)V

    return-object v6
.end method

.method private a(Lcom/huawei/openalliance/ad/net/http/a;Ljava/net/HttpURLConnection;)V
    .locals 2

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/a;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "Content-Type"

    iget-object v1, p1, Lcom/huawei/openalliance/ad/net/http/a;->g:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/a;->i:[B

    if-eqz v0, :cond_1

    const-string v0, "Content-Length"

    iget-object v1, p1, Lcom/huawei/openalliance/ad/net/http/a;->i:[B

    array-length v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private a(Ljava/net/HttpURLConnection;Lcom/huawei/openalliance/ad/net/http/c;)V
    .locals 6

    const-string v0, "Accept-Encoding"

    const-string v1, "gzip"

    invoke-virtual {p1, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/net/http/c;->a()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private a(Ljava/net/URLConnection;)Z
    .locals 2

    const-string v0, "Content-Encoding"

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v0, "gzip"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/net/http/d;Lcom/huawei/openalliance/ad/net/http/a;)Lcom/huawei/openalliance/ad/net/http/Response;
    .locals 19

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/openalliance/ad/net/http/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/openalliance/ad/net/http/a;->b()Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/openalliance/ad/net/http/a;->c()Ljava/lang/String;

    move-result-object v9

    new-instance v0, Lcom/huawei/openalliance/ad/net/http/e$a;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/net/http/e$a;-><init>()V

    invoke-virtual {v0, v9}, Lcom/huawei/openalliance/ad/net/http/e$a;->a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/net/http/e$a;

    move-result-object v0

    move-object/from16 v1, p2

    iget-object v1, v1, Lcom/huawei/openalliance/ad/net/http/a;->h:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/net/http/e$a;->a(Ljava/util/List;)Lcom/huawei/openalliance/ad/net/http/e$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/net/http/e$a;->a()Lcom/huawei/openalliance/ad/net/http/e;

    move-result-object v10

    invoke-virtual {v10}, Lcom/huawei/openalliance/ad/net/http/e;->c()Ljava/lang/String;

    move-result-object v8

    :goto_0
    move-object/from16 v0, p2

    iget-object v0, v0, Lcom/huawei/openalliance/ad/net/http/a;->i:[B

    if-eqz v0, :cond_1

    move-object/from16 v0, p2

    iget-object v0, v0, Lcom/huawei/openalliance/ad/net/http/a;->i:[B

    array-length v0, v0

    if-lez v0, :cond_1

    const/4 v9, 0x1

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    :goto_1
    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, -0x1

    move-object/from16 v0, p0

    move-object v1, v8

    move-object/from16 v2, p2

    :try_start_0
    iget-object v2, v2, Lcom/huawei/openalliance/ad/net/http/a;->e:Ljava/lang/String;

    move v3, v9

    move-object/from16 v4, p2

    iget-object v4, v4, Lcom/huawei/openalliance/ad/net/http/a;->f:Lcom/huawei/openalliance/ad/net/http/c;

    move-object/from16 v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/huawei/openalliance/ad/net/http/f;->a(Ljava/lang/String;Ljava/lang/String;ZLcom/huawei/openalliance/ad/net/http/c;Lcom/huawei/openalliance/ad/net/http/d;)Ljava/net/HttpURLConnection;

    move-result-object v0

    move-object v14, v0

    if-eqz v9, :cond_2

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1, v14}, Lcom/huawei/openalliance/ad/net/http/f;->a(Lcom/huawei/openalliance/ad/net/http/a;Ljava/net/HttpURLConnection;)V

    new-instance v0, Ljava/io/BufferedOutputStream;

    invoke-virtual {v14}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v10, v0

    move-object/from16 v0, p2

    iget-object v0, v0, Lcom/huawei/openalliance/ad/net/http/a;->i:[B

    invoke-virtual {v10, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v10}, Ljava/io/OutputStream;->flush()V

    :cond_2
    new-instance v16, Lcom/huawei/openalliance/ad/net/http/Response;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/openalliance/ad/net/http/Response;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_3

    invoke-virtual {v14}, Ljava/net/HttpURLConnection;->getContentLengthLong()J

    move-result-wide v0

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Lcom/huawei/openalliance/ad/net/http/Response;->a(J)V

    goto :goto_2

    :cond_3
    invoke-virtual {v14}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v0

    int-to-long v0, v0

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Lcom/huawei/openalliance/ad/net/http/Response;->a(J)V

    :goto_2
    invoke-virtual {v14}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    move v15, v0

    move-object/from16 v0, v16

    invoke-virtual {v0, v15}, Lcom/huawei/openalliance/ad/net/http/Response;->a(I)V

    invoke-virtual {v14}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v11, v0

    move-object/from16 v0, p0

    invoke-direct {v0, v14}, Lcom/huawei/openalliance/ad/net/http/f;->a(Ljava/net/URLConnection;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v0, v11}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v12, v0

    :cond_4
    if-eqz v12, :cond_5

    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, v12}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v13, v0

    goto :goto_3

    :cond_5
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, v11}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v13, v0

    :goto_3
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v15

    move-object v4, v13

    invoke-virtual/range {v16 .. v16}, Lcom/huawei/openalliance/ad/net/http/Response;->c()J

    move-result-wide v5

    move-object/from16 v7, v16

    invoke-virtual/range {v0 .. v7}, Lcom/huawei/openalliance/ad/net/http/f;->a(Lcom/huawei/openalliance/ad/net/http/d;Lcom/huawei/openalliance/ad/net/http/a;ILjava/io/InputStream;JLcom/huawei/openalliance/ad/net/http/Response;)V
    :try_end_0
    .catch Lcom/huawei/openalliance/ad/exception/c; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v17, v16

    invoke-static {v10}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v11}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v12}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v13}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v14}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/net/HttpURLConnection;)V

    const-string v0, "HttpUrlConnectionCaller"

    const-string v1, "close connection"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-object v17

    :catch_0
    move-exception v16

    const-string v0, "HttpUrlConnectionCaller"

    const-string v1, "http execute encounter SSLConfigException"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    throw v16

    :catch_1
    move-exception v16

    const-string v0, "HttpUrlConnectionCaller"

    const-string v1, "http execute encounter %s - http code: %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v16

    :catch_2
    move-exception v16

    const-string v0, "HttpUrlConnectionCaller"

    const-string v1, "http execute encounter %s - http code: %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v18

    invoke-static {v10}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v11}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v12}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v13}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v14}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/net/HttpURLConnection;)V

    const-string v0, "HttpUrlConnectionCaller"

    const-string v1, "close connection"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    throw v18
.end method
