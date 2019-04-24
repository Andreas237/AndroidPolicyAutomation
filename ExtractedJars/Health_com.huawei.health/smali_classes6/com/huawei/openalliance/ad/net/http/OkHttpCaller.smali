.class Lcom/huawei/openalliance/ad/net/http/OkHttpCaller;
.super Lcom/huawei/openalliance/ad/net/http/b;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation


# static fields
.field private static a:Lcom/huawei/okhttp3/OkHttpClient;

.field private static final b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/openalliance/ad/net/http/OkHttpCaller;->b:[B

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/net/http/b;-><init>()V

    return-void
.end method

.method private static a(Lcom/huawei/openalliance/ad/net/http/d;)Lcom/huawei/okhttp3/OkHttpClient;
    .locals 10

    sget-object v6, Lcom/huawei/openalliance/ad/net/http/OkHttpCaller;->b:[B

    monitor-enter v6

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/net/http/OkHttpCaller;->a:Lcom/huawei/okhttp3/OkHttpClient;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/okhttp3/OkHttpClient$Builder;

    invoke-direct {v0}, Lcom/huawei/okhttp3/OkHttpClient$Builder;-><init>()V

    new-instance v1, Lcom/huawei/okhttp3/ConnectionPool;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const/16 v3, 0x8

    const-wide/16 v4, 0xa

    invoke-direct {v1, v3, v4, v5, v2}, Lcom/huawei/okhttp3/ConnectionPool;-><init>(IJLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v0, v1}, Lcom/huawei/okhttp3/OkHttpClient$Builder;->connectionPool(Lcom/huawei/okhttp3/ConnectionPool;)Lcom/huawei/okhttp3/OkHttpClient$Builder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/openalliance/ad/net/http/d;->c:I

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/okhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lcom/huawei/okhttp3/OkHttpClient$Builder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/openalliance/ad/net/http/d;->b:I

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/okhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lcom/huawei/okhttp3/OkHttpClient$Builder;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/huawei/okhttp3/Protocol;

    sget-object v2, Lcom/huawei/okhttp3/Protocol;->HTTP_2:Lcom/huawei/okhttp3/Protocol;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lcom/huawei/okhttp3/Protocol;->HTTP_1_1:Lcom/huawei/okhttp3/Protocol;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/okhttp3/OkHttpClient$Builder;->protocols(Ljava/util/List;)Lcom/huawei/okhttp3/OkHttpClient$Builder;

    move-result-object v7

    invoke-static {v7}, Lcom/huawei/openalliance/ad/net/http/HttpsConfig;->a(Lcom/huawei/okhttp3/OkHttpClient$Builder;)V

    sget-object v0, Lcom/huawei/okhttp3/Protocol;->HTTP_2:Lcom/huawei/okhttp3/Protocol;

    invoke-virtual {v7, v0}, Lcom/huawei/okhttp3/OkHttpClient$Builder;->createDispatcher(Lcom/huawei/okhttp3/Protocol;)Lcom/huawei/okhttp3/AbsDispatcher;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/huawei/okhttp3/OkHttpClient$Builder;->dispatcher(Lcom/huawei/okhttp3/AbsDispatcher;)Lcom/huawei/okhttp3/OkHttpClient$Builder;

    invoke-virtual {v7}, Lcom/huawei/okhttp3/OkHttpClient$Builder;->build()Lcom/huawei/okhttp3/OkHttpClient;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/net/http/OkHttpCaller;->a:Lcom/huawei/okhttp3/OkHttpClient;

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/net/http/OkHttpCaller;->a:Lcom/huawei/okhttp3/OkHttpClient;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v6

    return-object v0

    :catchall_0
    move-exception v9

    monitor-exit v6

    throw v9
.end method

.method private a(Lcom/huawei/okhttp3/Request$Builder;Lcom/huawei/openalliance/ad/net/http/c;)V
    .locals 6

    const-string v0, "Accept-Encoding"

    const-string v1, "gzip"

    invoke-virtual {p1, v0, v1}, Lcom/huawei/okhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/okhttp3/Request$Builder;

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

    invoke-virtual {p1, v0, v1}, Lcom/huawei/okhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/okhttp3/Request$Builder;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/net/http/a;Lcom/huawei/okhttp3/Request$Builder;)V
    .locals 2

    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/a;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "Content-Type"

    iget-object v1, p1, Lcom/huawei/openalliance/ad/net/http/a;->g:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Lcom/huawei/okhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/okhttp3/Request$Builder;

    :cond_0
    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/a;->i:[B

    if-eqz v0, :cond_1

    const-string v0, "Content-Length"

    iget-object v1, p1, Lcom/huawei/openalliance/ad/net/http/a;->i:[B

    array-length v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/huawei/okhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/okhttp3/Request$Builder;

    :cond_1
    return-void
.end method

.method private a(Lcom/huawei/okhttp3/Response;)Z
    .locals 2

    const-string v0, "Content-Encoding"

    invoke-virtual {p1, v0}, Lcom/huawei/okhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

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
    .locals 22

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/openalliance/ad/net/http/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/openalliance/ad/net/http/a;->b()Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/huawei/openalliance/ad/net/http/e$a;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/net/http/e$a;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/openalliance/ad/net/http/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/net/http/e$a;->a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/net/http/e$a;

    move-result-object v0

    move-object/from16 v1, p2

    iget-object v1, v1, Lcom/huawei/openalliance/ad/net/http/a;->h:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/net/http/e$a;->a(Ljava/util/List;)Lcom/huawei/openalliance/ad/net/http/e$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/net/http/e$a;->a()Lcom/huawei/openalliance/ad/net/http/e;

    move-result-object v9

    invoke-virtual {v9}, Lcom/huawei/openalliance/ad/net/http/e;->c()Ljava/lang/String;

    move-result-object v8

    :goto_0
    const-string v0, "OkHttpCaller"

    const-string v1, "execute url: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v8}, Lcom/huawei/openalliance/ad/utils/ad;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

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
    new-instance v0, Lcom/huawei/okhttp3/Request$Builder;

    invoke-direct {v0}, Lcom/huawei/okhttp3/Request$Builder;-><init>()V

    invoke-virtual {v0, v8}, Lcom/huawei/okhttp3/Request$Builder;->url(Ljava/lang/String;)Lcom/huawei/okhttp3/Request$Builder;

    move-result-object v10

    move-object/from16 v0, p2

    iget-object v0, v0, Lcom/huawei/openalliance/ad/net/http/a;->f:Lcom/huawei/openalliance/ad/net/http/c;

    move-object/from16 v1, p0

    invoke-direct {v1, v10, v0}, Lcom/huawei/openalliance/ad/net/http/OkHttpCaller;->a(Lcom/huawei/okhttp3/Request$Builder;Lcom/huawei/openalliance/ad/net/http/c;)V

    if-eqz v9, :cond_2

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1, v10}, Lcom/huawei/openalliance/ad/net/http/OkHttpCaller;->a(Lcom/huawei/openalliance/ad/net/http/a;Lcom/huawei/okhttp3/Request$Builder;)V

    move-object/from16 v0, p2

    iget-object v0, v0, Lcom/huawei/openalliance/ad/net/http/a;->g:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/okhttp3/MediaType;->parse(Ljava/lang/String;)Lcom/huawei/okhttp3/MediaType;

    move-result-object v0

    move-object/from16 v1, p2

    iget-object v1, v1, Lcom/huawei/openalliance/ad/net/http/a;->i:[B

    invoke-static {v0, v1}, Lcom/huawei/okhttp3/RequestBody;->create(Lcom/huawei/okhttp3/MediaType;[B)Lcom/huawei/okhttp3/RequestBody;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/huawei/okhttp3/Request$Builder;->post(Lcom/huawei/okhttp3/RequestBody;)Lcom/huawei/okhttp3/Request$Builder;

    :cond_2
    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, -0x1

    :try_start_0
    invoke-virtual {v10}, Lcom/huawei/okhttp3/Request$Builder;->build()Lcom/huawei/okhttp3/Request;

    move-result-object v16

    invoke-static/range {p1 .. p1}, Lcom/huawei/openalliance/ad/net/http/OkHttpCaller;->a(Lcom/huawei/openalliance/ad/net/http/d;)Lcom/huawei/okhttp3/OkHttpClient;

    move-result-object v17

    move-object/from16 v0, v17

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/huawei/okhttp3/OkHttpClient;->newCall(Lcom/huawei/okhttp3/Request;)Lcom/huawei/okhttp3/Call;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/okhttp3/Call;->execute()Lcom/huawei/okhttp3/Response;

    move-result-object v0

    move-object v14, v0

    invoke-virtual {v14}, Lcom/huawei/okhttp3/Response;->body()Lcom/huawei/okhttp3/ResponseBody;

    move-result-object v18

    new-instance v19, Lcom/huawei/openalliance/ad/net/http/Response;

    invoke-direct/range {v19 .. v19}, Lcom/huawei/openalliance/ad/net/http/Response;-><init>()V

    invoke-virtual/range {v18 .. v18}, Lcom/huawei/okhttp3/ResponseBody;->contentLength()J

    move-result-wide v0

    move-object/from16 v2, v19

    invoke-virtual {v2, v0, v1}, Lcom/huawei/openalliance/ad/net/http/Response;->a(J)V

    invoke-virtual {v14}, Lcom/huawei/okhttp3/Response;->code()I

    move-result v0

    move v15, v0

    move-object/from16 v0, v19

    invoke-virtual {v0, v15}, Lcom/huawei/openalliance/ad/net/http/Response;->a(I)V

    invoke-virtual/range {v18 .. v18}, Lcom/huawei/okhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v12, v0

    move-object/from16 v0, p0

    invoke-direct {v0, v14}, Lcom/huawei/openalliance/ad/net/http/OkHttpCaller;->a(Lcom/huawei/okhttp3/Response;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v0, v12}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v11, v0

    :cond_3
    if-eqz v11, :cond_4

    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, v11}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v13, v0

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, v12}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v13, v0

    :goto_2
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v15

    move-object v4, v13

    invoke-virtual/range {v19 .. v19}, Lcom/huawei/openalliance/ad/net/http/Response;->c()J

    move-result-wide v5

    move-object/from16 v7, v19

    invoke-virtual/range {v0 .. v7}, Lcom/huawei/openalliance/ad/net/http/OkHttpCaller;->a(Lcom/huawei/openalliance/ad/net/http/d;Lcom/huawei/openalliance/ad/net/http/a;ILjava/io/InputStream;JLcom/huawei/openalliance/ad/net/http/Response;)V
    :try_end_0
    .catch Lcom/huawei/openalliance/ad/exception/c; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v20, v19

    invoke-static {v12}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v11}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v13}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v14}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    const-string v0, "OkHttpCaller"

    const-string v1, "end request"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-object v20

    :catch_0
    move-exception v16

    const-string v0, "OkHttpCaller"

    const-string v1, "http execute encounter SSLConfigException"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    throw v16

    :catch_1
    move-exception v16

    const-string v0, "OkHttpCaller"

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

    const-string v0, "OkHttpCaller"

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
    move-exception v21

    invoke-static {v12}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v11}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v13}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v14}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    const-string v0, "OkHttpCaller"

    const-string v1, "end request"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    throw v21
.end method
