.class public abstract Lo/cji;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cji$a;
    }
.end annotation


# direct methods
.method public static a(Ljava/lang/String;Ljava/lang/String;)Lo/cjl;
    .locals 15

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lo/cjl;

    const-string v1, ""

    const/16 v2, -0x64

    invoke-direct {v0, v2, v1}, Lo/cjl;-><init>(ILjava/lang/String;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_1

    const-string p1, ""

    :cond_1
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, -0x66

    :try_start_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "POST"

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, Lo/cji;->c(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Lo/cji$a; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    :catch_0
    move-exception v9

    const-string v0, "HttpClient"

    const-string v1, "sendPostRequest(String): SSLConfigException"

    :try_start_1
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v10, Lo/cjl;

    const-string v0, ""

    const/16 v1, -0x65

    invoke-direct {v10, v1, v0}, Lo/cjl;-><init>(ILjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    nop

    nop

    nop

    return-object v10

    :goto_0
    :try_start_2
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    move-object v6, v0

    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/OutputStreamWriter;

    const-string v2, "UTF-8"

    invoke-direct {v1, v6, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    move-object v5, v0

    move-object/from16 v0, p1

    invoke-virtual {v5, v0}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/BufferedWriter;->flush()V

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    move v8, v0

    invoke-static {v7}, Lo/cji;->b(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lo/cjl;

    invoke-direct {v10, v8, v9}, Lo/cjl;-><init>(ILjava/lang/String;)V

    const-string v0, "HiAnalytics"

    const-string v1, "PostRequest(String) resultCode: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v11, v10

    if-eqz v5, :cond_2

    :try_start_3
    invoke-virtual {v5}, Ljava/io/BufferedWriter;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    :catch_1
    move-exception v12

    const-string v0, "HttpClient"

    const-string v1, "When the PostRequest(String)\'s BufferedWriter close: IOException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    if-eqz v6, :cond_3

    :try_start_4
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_1

    :catch_2
    move-exception v12

    const-string v0, "HttpClient"

    const-string v1, "When the PostRequest(String)\'s OutputStream close: IOException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_1
    if-eqz v7, :cond_4

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    const-string v0, "HttpClient"

    const-string v1, "disconnect"

    invoke-static {v0, v1}, Lo/ciy;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    return-object v11

    :catch_3
    move-exception v9

    const-string v0, "HttpClient"

    const-string v1, "PostRequest(String): IOException"

    :try_start_5
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v10, Lo/cjl;

    const-string v0, ""

    invoke-direct {v10, v8, v0}, Lo/cjl;-><init>(ILjava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v5, :cond_5

    :try_start_6
    invoke-virtual {v5}, Ljava/io/BufferedWriter;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_2

    :catch_4
    move-exception v11

    const-string v0, "HttpClient"

    const-string v1, "When the PostRequest(String)\'s BufferedWriter close: IOException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    if-eqz v6, :cond_6

    :try_start_7
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_2

    :catch_5
    move-exception v11

    const-string v0, "HttpClient"

    const-string v1, "When the PostRequest(String)\'s OutputStream close: IOException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_2
    if-eqz v7, :cond_7

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    const-string v0, "HttpClient"

    const-string v1, "disconnect"

    invoke-static {v0, v1}, Lo/ciy;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    return-object v10

    :catchall_0
    move-exception v13

    if-eqz v5, :cond_8

    :try_start_8
    invoke-virtual {v5}, Ljava/io/BufferedWriter;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    goto :goto_3

    :catch_6
    move-exception v14

    const-string v0, "HttpClient"

    const-string v1, "When the PostRequest(String)\'s BufferedWriter close: IOException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    if-eqz v6, :cond_9

    :try_start_9
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_7

    goto :goto_3

    :catch_7
    move-exception v14

    const-string v0, "HttpClient"

    const-string v1, "When the PostRequest(String)\'s OutputStream close: IOException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_9
    :goto_3
    if-eqz v7, :cond_a

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    const-string v0, "HttpClient"

    const-string v1, "disconnect"

    invoke-static {v0, v1}, Lo/ciy;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_a
    throw v13
.end method

.method private static b(Ljava/net/HttpURLConnection;)Ljava/lang/String;
    .locals 9

    const/4 v5, 0x0

    :try_start_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    const/16 v0, 0x800

    invoke-static {v5, v0}, Lo/cka;->e(Ljava/io/InputStream;I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v6

    invoke-static {v5}, Lo/cka;->d(Ljava/io/InputStream;)V

    return-object v6

    :catch_0
    move-exception v6

    :try_start_1
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v7

    const-string v0, "HttpClient"

    const-string v1, "When Response Content From Connection happend IOException,the ResponseCode is %d "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v8

    invoke-static {v5}, Lo/cka;->d(Ljava/io/InputStream;)V

    throw v8
.end method

.method private static c(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Ljava/net/HttpURLConnection;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/net/HttpURLConnection;"
        }
    .end annotation

    new-instance v2, Ljava/net/URL;

    invoke-direct {v2, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/net/HttpURLConnection;

    invoke-static {v3}, Lo/cji;->c(Ljava/net/HttpURLConnection;)V

    invoke-virtual {v3, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/16 v0, 0x2ee0

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    const-string v0, "Content-Type"

    const-string v1, "application/json; charset=UTF-8"

    invoke-virtual {v3, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Content-Length"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p3, :cond_2

    invoke-interface {p3}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_2

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v6, v0}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    return-object v3
.end method

.method private static c(Ljava/net/HttpURLConnection;)V
    .locals 4

    instance-of v0, p0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v0, :cond_1

    move-object v2, p0

    check-cast v2, Ljavax/net/ssl/HttpsURLConnection;

    invoke-static {}, Lo/cje;->d()Ljavax/net/SocketFactory;

    move-result-object v3

    if-eqz v3, :cond_0

    instance-of v0, v3, Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_0

    move-object v0, v3

    check-cast v0, Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v2, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lo/cji$a;

    const-string v1, "No ssl socket factory set"

    invoke-direct {v0, v1}, Lo/cji$a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public static d(Ljava/lang/String;[BLjava/util/Map;)Lo/cjl;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;[BLjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lo/cjl;"
        }
    .end annotation

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lo/cjl;

    const-string v1, ""

    const/16 v2, -0x64

    invoke-direct {v0, v2, v1}, Lo/cjl;-><init>(ILjava/lang/String;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    new-array v0, v0, [B

    move-object/from16 p1, v0

    :cond_1
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, -0x66

    move-object/from16 v0, p1

    :try_start_0
    array-length v0, v0

    const-string v1, "POST"

    move-object/from16 v2, p2

    invoke-static {p0, v0, v1, v2}, Lo/cji;->c(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Lo/cji$a; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    :catch_0
    move-exception v9

    const-string v0, "HttpClient"

    const-string v1, "PostRequest(byte[]): SSLConfigException"

    :try_start_1
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v10, Lo/cjl;

    const-string v0, ""

    const/16 v1, -0x65

    invoke-direct {v10, v1, v0}, Lo/cjl;-><init>(ILjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    nop

    nop

    nop

    return-object v10

    :goto_0
    :try_start_2
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    move-object v6, v0

    new-instance v0, Ljava/io/BufferedOutputStream;

    invoke-direct {v0, v6}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v5, v0

    move-object/from16 v0, p1

    invoke-virtual {v5, v0}, Ljava/io/BufferedOutputStream;->write([B)V

    invoke-virtual {v5}, Ljava/io/BufferedOutputStream;->flush()V

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    move v8, v0

    invoke-static {v7}, Lo/cji;->b(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lo/cjl;

    invoke-direct {v10, v8, v9}, Lo/cjl;-><init>(ILjava/lang/String;)V

    const-string v0, "HiAnalytics"

    const-string v1, "PostRequest(byte[]) resultCode: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v11, v10

    if-eqz v5, :cond_2

    :try_start_3
    invoke-virtual {v5}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    :catch_1
    move-exception v12

    const-string v0, "HttpClient"

    const-string v1, "When the PostRequest(byte[])\'s BufferedOutputStream close: IOException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    if-eqz v6, :cond_3

    :try_start_4
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_1

    :catch_2
    move-exception v12

    const-string v0, "HttpClient"

    const-string v1, "When the PostRequest(byte[])\'s OutputStream close: IOException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_1
    if-eqz v7, :cond_4

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    const-string v0, "HttpClient"

    const-string v1, "disconnect"

    invoke-static {v0, v1}, Lo/ciy;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    return-object v11

    :catch_3
    move-exception v9

    const-string v0, "HttpClient"

    const-string v1, "PostRequest(byte[]): IOException"

    :try_start_5
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v10, Lo/cjl;

    const-string v0, ""

    invoke-direct {v10, v8, v0}, Lo/cjl;-><init>(ILjava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v5, :cond_5

    :try_start_6
    invoke-virtual {v5}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_2

    :catch_4
    move-exception v11

    const-string v0, "HttpClient"

    const-string v1, "When the PostRequest(byte[])\'s BufferedOutputStream close: IOException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    if-eqz v6, :cond_6

    :try_start_7
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_2

    :catch_5
    move-exception v11

    const-string v0, "HttpClient"

    const-string v1, "When the PostRequest(byte[])\'s OutputStream close: IOException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_2
    if-eqz v7, :cond_7

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    const-string v0, "HttpClient"

    const-string v1, "disconnect"

    invoke-static {v0, v1}, Lo/ciy;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    return-object v10

    :catchall_0
    move-exception v13

    if-eqz v5, :cond_8

    :try_start_8
    invoke-virtual {v5}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    goto :goto_3

    :catch_6
    move-exception v14

    const-string v0, "HttpClient"

    const-string v1, "When the PostRequest(byte[])\'s BufferedOutputStream close: IOException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    if-eqz v6, :cond_9

    :try_start_9
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_7

    goto :goto_3

    :catch_7
    move-exception v14

    const-string v0, "HttpClient"

    const-string v1, "When the PostRequest(byte[])\'s OutputStream close: IOException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_9
    :goto_3
    if-eqz v7, :cond_a

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    const-string v0, "HttpClient"

    const-string v1, "disconnect"

    invoke-static {v0, v1}, Lo/ciy;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_a
    throw v13
.end method
