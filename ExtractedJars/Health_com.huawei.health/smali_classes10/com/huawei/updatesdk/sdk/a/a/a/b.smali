.class public Lcom/huawei/updatesdk/sdk/a/a/a/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/updatesdk/sdk/a/a/a/b$a;
    }
.end annotation


# instance fields
.field private a:Ljava/net/HttpURLConnection;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/a/a/a/b;->a:Ljava/net/HttpURLConnection;

    return-void
.end method

.method private static a(Ljava/io/InputStream;Ljava/io/DataOutputStream;Ljava/io/BufferedInputStream;Ljava/net/HttpURLConnection;)V
    .locals 3

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "HTTPUtil"

    const-string v1, "doPostFile, fileIn.close() error"

    invoke-static {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    if-eqz p1, :cond_1

    :try_start_1
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v2

    const-string v0, "HTTPUtil"

    const-string v1, "doPostFile, reqOut.close() error"

    invoke-static {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    if-eqz p2, :cond_2

    :try_start_2
    invoke-virtual {p2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v2

    const-string v0, "HTTPUtil"

    const-string v1, "doPostFile, resIn.close() error"

    invoke-static {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_2
    if-eqz p3, :cond_3

    invoke-virtual {p3}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_3
    return-void
.end method

.method private a([B)[B
    .locals 9

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object v5, v0

    new-instance v0, Ljava/io/DataOutputStream;

    new-instance v1, Ljava/util/zip/GZIPOutputStream;

    array-length v2, p1

    invoke-direct {v1, v5, v2}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;I)V

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v4, v0

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {v4, p1, v1, v0}, Ljava/io/DataOutputStream;->write([BII)V

    invoke-virtual {v4}, Ljava/io/DataOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_1

    :try_start_1
    invoke-virtual {v4}, Ljava/io/DataOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v6

    const-string v0, "HTTPUtil"

    const-string v1, "gzip error!"

    invoke-static {v0, v1, v6}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_1
    move-exception v6

    const-string v0, "HTTPUtil"

    const-string v1, "gzip error!"

    :try_start_2
    invoke-static {v0, v1, v6}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v4, :cond_1

    :try_start_3
    invoke-virtual {v4}, Ljava/io/DataOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    :catch_2
    move-exception v6

    const-string v0, "HTTPUtil"

    const-string v1, "gzip error!"

    invoke-static {v0, v1, v6}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :catchall_0
    move-exception v7

    if-eqz v4, :cond_0

    :try_start_4
    invoke-virtual {v4}, Ljava/io/DataOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_0

    :catch_3
    move-exception v8

    const-string v0, "HTTPUtil"

    const-string v1, "gzip error!"

    invoke-static {v0, v1, v8}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw v7

    :cond_1
    :goto_1
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    return-object v3
.end method

.method public static b(Ljava/lang/String;)Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v2

    :cond_0
    const-string v0, "&"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    move-object v5, v3

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_4

    aget-object v8, v5, v7

    if-nez v8, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "="

    invoke-virtual {v8, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    array-length v0, v4

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    const/4 v0, 0x0

    aget-object v0, v4, v0

    const/4 v1, 0x1

    aget-object v1, v4, v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    array-length v0, v4

    if-lez v0, :cond_3

    const/4 v0, 0x0

    aget-object v0, v4, v0

    const-string v1, ""

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_4
    return-object v2
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/updatesdk/sdk/a/a/a/b$a;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/huawei/updatesdk/sdk/a/a/a/b$a;

    invoke-direct {v5}, Lcom/huawei/updatesdk/sdk/a/a/a/b$a;-><init>()V

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/huawei/updatesdk/sdk/a/a/a/b;->a(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v0

    move-object v4, v0

    iput-object v4, p0, Lcom/huawei/updatesdk/sdk/a/a/a/b;->a:Ljava/net/HttpURLConnection;

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    const/16 v0, 0x1388

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const/16 v0, 0x2710

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const-string v0, "POST"

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const-string v0, "Content-Type"

    const-string v1, "application/x-gzip"

    invoke-virtual {v4, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Content-Encoding"

    const-string v1, "gzip"

    invoke-virtual {v4, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Connection"

    const-string v1, "Keep-Alive"

    invoke-virtual {v4, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "User-Agent"

    invoke-virtual {v4, v0, p4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/io/DataOutputStream;

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v2, v0

    invoke-virtual {p2, p3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/updatesdk/sdk/a/a/a/b;->a([B)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/DataOutputStream;->flush()V

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    invoke-static {v5, v0}, Lcom/huawei/updatesdk/sdk/a/a/a/b$a;->a(Lcom/huawei/updatesdk/sdk/a/a/a/b$a;I)I

    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v3, v0

    new-instance v6, Lcom/huawei/updatesdk/sdk/a/c/b;

    invoke-direct {v6}, Lcom/huawei/updatesdk/sdk/a/c/b;-><init>()V

    const/4 v7, 0x0

    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/a/a/a;->a()Lcom/huawei/updatesdk/sdk/a/a/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/a/a/a/a;->b()[B

    move-result-object v8

    :goto_0
    invoke-virtual {v3, v8}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v0

    move v7, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {v6, v8, v7}, Lcom/huawei/updatesdk/sdk/a/c/b;->a([BI)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/a/a/a;->a()Lcom/huawei/updatesdk/sdk/a/a/a/a;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/huawei/updatesdk/sdk/a/a/a/a;->a([B)V

    invoke-virtual {v6}, Lcom/huawei/updatesdk/sdk/a/c/b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/huawei/updatesdk/sdk/a/a/a/b$a;->a(Lcom/huawei/updatesdk/sdk/a/a/a/b$a;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_1
    invoke-static {v2}, Lcom/huawei/updatesdk/sdk/a/c/c;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/updatesdk/sdk/a/c/c;->a(Ljava/io/Closeable;)V

    goto :goto_1

    :catchall_0
    move-exception v9

    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_2
    invoke-static {v2}, Lcom/huawei/updatesdk/sdk/a/c/c;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/updatesdk/sdk/a/c/c;->a(Ljava/io/Closeable;)V

    throw v9

    :goto_1
    return-object v5
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/huawei/updatesdk/sdk/a/a/a/b$a;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;)Lcom/huawei/updatesdk/sdk/a/a/a/b$a;"
        }
    .end annotation

    new-instance v3, Lcom/huawei/updatesdk/sdk/a/a/a/b$a;

    invoke-direct {v3}, Lcom/huawei/updatesdk/sdk/a/a/a/b$a;-><init>()V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :try_start_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v10, "--"

    const-string v11, "\r\n"

    const-string v12, "multipart/form-data"

    const-string v13, "UTF-8"

    new-instance v0, Ljava/net/URL;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    move-object v14, v0

    invoke-virtual {v14}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v7, v0

    move-object/from16 v0, p0

    iput-object v7, v0, Lcom/huawei/updatesdk/sdk/a/a/a/b;->a:Ljava/net/HttpURLConnection;

    const/16 v0, 0x2328

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const/16 v0, 0x2710

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    const-string v0, "POST"

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const-string v0, "Connection"

    const-string v1, "Keep-Alive"

    invoke-virtual {v7, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "User-Agent"

    move-object/from16 v1, p4

    invoke-virtual {v7, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Content-Type"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ";boundary="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const/high16 v0, 0x80000

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    invoke-static/range {p2 .. p2}, Lcom/huawei/updatesdk/sdk/a/a/a/b;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v15

    new-instance v16, Ljava/lang/StringBuilder;

    invoke-direct/range {v16 .. v16}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v15}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_0
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Ljava/util/Map$Entry;

    invoke-interface/range {v20 .. v20}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Ljava/lang/String;

    invoke-interface/range {v20 .. v20}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Ljava/lang/String;

    invoke-static/range {v18 .. v18}, Lcom/huawei/updatesdk/sdk/a/c/f;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v16

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v16

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Content-Disposition: form-data; name=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Content-Type: text/plain; charset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Content-Transfer-Encoding: 8bit"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v16

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v16

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v16

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_0
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v5, v0

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/io/DataOutputStream;->write([B)V

    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/a/a/a;->a()Lcom/huawei/updatesdk/sdk/a/a/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/a/a/a/a;->b()[B

    move-result-object v19

    const/16 v20, 0x0

    invoke-interface/range {p3 .. p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :goto_1
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Ljava/util/Map$Entry;

    invoke-interface/range {v22 .. v22}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v23, v0

    check-cast v23, Ljava/lang/String;

    invoke-interface/range {v22 .. v22}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v24, v0

    check-cast v24, Ljava/lang/String;

    new-instance v0, Ljava/io/File;

    move-object/from16 v1, v24

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v25, v0

    new-instance v26, Ljava/lang/StringBuilder;

    invoke-direct/range {v26 .. v26}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v26

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v26

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v26

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Content-Disposition: form-data; name=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\"; filename=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v25 .. v25}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Content-Type: multipart/form-data; charset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v26

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/io/DataOutputStream;->write([B)V

    new-instance v0, Ljava/io/FileInputStream;

    move-object/from16 v1, v25

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v4, v0

    :goto_2
    move-object/from16 v0, v19

    invoke-virtual {v4, v0}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move/from16 v20, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    move-object/from16 v0, v19

    const/4 v1, 0x0

    move/from16 v2, v20

    invoke-virtual {v5, v0, v1, v2}, Ljava/io/DataOutputStream;->write([BII)V

    goto :goto_2

    :cond_1
    invoke-static {v4}, Lcom/huawei/updatesdk/sdk/a/c/c;->a(Ljava/io/Closeable;)V

    const/4 v4, 0x0

    invoke-virtual {v11, v13}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/io/DataOutputStream;->write([B)V

    goto/16 :goto_1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v5, v0}, Ljava/io/DataOutputStream;->write([B)V

    invoke-virtual {v5}, Ljava/io/DataOutputStream;->flush()V

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    invoke-static {v3, v0}, Lcom/huawei/updatesdk/sdk/a/a/a/b$a;->a(Lcom/huawei/updatesdk/sdk/a/a/a/b$a;I)I

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getContentEncoding()Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v8, v0

    const-string v0, "gzip"

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "z"

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    new-instance v0, Ljava/io/BufferedInputStream;

    new-instance v1, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v1, v8}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v6, v0

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, v8}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v6, v0

    :goto_3
    new-instance v24, Lcom/huawei/updatesdk/sdk/a/c/b;

    invoke-direct/range {v24 .. v24}, Lcom/huawei/updatesdk/sdk/a/c/b;-><init>()V

    :cond_5
    move-object/from16 v0, v19

    invoke-virtual {v6, v0}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v0

    move/from16 v20, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_7

    move-object/from16 v0, v24

    move-object/from16 v1, v19

    move/from16 v2, v20

    invoke-virtual {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/a/c/b;->a([BI)V

    invoke-virtual/range {v24 .. v24}, Lcom/huawei/updatesdk/sdk/a/c/b;->a()I

    move-result v0

    const/high16 v1, 0x100000

    if-le v0, v1, :cond_5

    const-string v0, ""

    invoke-static {v3, v0}, Lcom/huawei/updatesdk/sdk/a/a/a/b$a;->a(Lcom/huawei/updatesdk/sdk/a/a/a/b$a;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/a/a/a;->a()Lcom/huawei/updatesdk/sdk/a/a/a/a;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/a/a/a/a;->a([B)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v25, v3

    invoke-static {v4, v5, v6, v7}, Lcom/huawei/updatesdk/sdk/a/a/a/b;->a(Ljava/io/InputStream;Ljava/io/DataOutputStream;Ljava/io/BufferedInputStream;Ljava/net/HttpURLConnection;)V

    const/4 v0, 0x0

    if-eq v0, v8, :cond_6

    :try_start_1
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :catch_0
    move-exception v26

    const-string v0, "HTTPUtil"

    const-string v1, "doPostFile, inStream.close() error"

    move-object/from16 v2, v26

    invoke-static {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    :goto_4
    return-object v25

    :cond_7
    :try_start_2
    invoke-virtual/range {v24 .. v24}, Lcom/huawei/updatesdk/sdk/a/c/b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/huawei/updatesdk/sdk/a/a/a/b$a;->a(Lcom/huawei/updatesdk/sdk/a/a/a/b$a;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/a/a/a;->a()Lcom/huawei/updatesdk/sdk/a/a/a/a;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/a/a/a/a;->a([B)V
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v4, v5, v6, v7}, Lcom/huawei/updatesdk/sdk/a/a/a/b;->a(Ljava/io/InputStream;Ljava/io/DataOutputStream;Ljava/io/BufferedInputStream;Ljava/net/HttpURLConnection;)V

    const/4 v0, 0x0

    if-eq v0, v8, :cond_9

    :try_start_3
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_6

    :catch_1
    move-exception v9

    const-string v0, "HTTPUtil"

    const-string v1, "doPostFile, inStream.close() error"

    invoke-static {v0, v1, v9}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_6

    :catch_2
    move-exception v9

    const-string v0, "HTTPUtil"

    const-string v1, "UnsupportedEncodingException endData error"

    :try_start_4
    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-static {v4, v5, v6, v7}, Lcom/huawei/updatesdk/sdk/a/a/a/b;->a(Ljava/io/InputStream;Ljava/io/DataOutputStream;Ljava/io/BufferedInputStream;Ljava/net/HttpURLConnection;)V

    const/4 v0, 0x0

    if-eq v0, v8, :cond_9

    :try_start_5
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_6

    :catch_3
    move-exception v9

    const-string v0, "HTTPUtil"

    const-string v1, "doPostFile, inStream.close() error"

    invoke-static {v0, v1, v9}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :catch_4
    move-exception v9

    const-string v0, "HTTPUtil"

    const-string v1, "IOException doPostFile error"

    :try_start_6
    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-static {v4, v5, v6, v7}, Lcom/huawei/updatesdk/sdk/a/a/a/b;->a(Ljava/io/InputStream;Ljava/io/DataOutputStream;Ljava/io/BufferedInputStream;Ljava/net/HttpURLConnection;)V

    const/4 v0, 0x0

    if-eq v0, v8, :cond_9

    :try_start_7
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_6

    :catch_5
    move-exception v9

    const-string v0, "HTTPUtil"

    const-string v1, "doPostFile, inStream.close() error"

    invoke-static {v0, v1, v9}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :catchall_0
    move-exception v27

    invoke-static {v4, v5, v6, v7}, Lcom/huawei/updatesdk/sdk/a/a/a/b;->a(Ljava/io/InputStream;Ljava/io/DataOutputStream;Ljava/io/BufferedInputStream;Ljava/net/HttpURLConnection;)V

    const/4 v0, 0x0

    if-eq v0, v8, :cond_8

    :try_start_8
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    goto :goto_5

    :catch_6
    move-exception v28

    const-string v0, "HTTPUtil"

    const-string v1, "doPostFile, inStream.close() error"

    move-object/from16 v2, v28

    invoke-static {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    :goto_5
    throw v27

    :cond_9
    :goto_6
    return-object v3
.end method

.method public a(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v1, 0x0

    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/a/a;->a()Lcom/huawei/updatesdk/sdk/service/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/a/a;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/a/c/c/b;->f(Landroid/content/Context;)Ljava/net/Proxy;

    move-result-object v3

    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/net/HttpURLConnection;

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v3}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/net/HttpURLConnection;

    :goto_0
    const/16 v0, 0x1388

    invoke-virtual {v2, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const/16 v0, 0x2710

    invoke-virtual {v2, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    return-object v2
.end method
